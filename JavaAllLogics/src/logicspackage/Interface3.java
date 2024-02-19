package logicspackage;

//This Generalization process can be achieved by declaring ImplClass 
//without name known as "Anonymous InnerClass as ImplClass".
import java.util.Scanner;

interface IComparable2
{
	public abstract int compareTo(int x,int y);
}

class Interface3 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value2:");
		int v2 = s.nextInt();
		
		System.out.println("Choice.\n1.Greater\n2.Smaller\nEnter the choice:");
		int choice = s.nextInt();
		
		if(v1==v2) 
		{
			System.out.println("Values are Same.");
			System.exit(0);
		}
		
		switch(choice)
		{
		case 1:
			IComparable2 gt = new IComparable2()
			{
				public int compareTo(int x,int y)
				{
					if(x>y) 
						return x;
					else 
						return y;
				}
			};
			System.out.println("Greater Value:"+gt.compareTo(v1,v2));
			break;
		
		case 2:
			IComparable2 sm = new IComparable2()
			{
				public int compareTo(int x,int y)
				{
					if(x<y) 
						return x;
					else 
						return y;
				}
			};
			System.out.println("Smaller Value:"+sm.compareTo(v1,v2));
			break;
		
		default:
			System.out.println("Invalid choice...");
		}
	}
}
