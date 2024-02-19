package logicspackage;
import java.util.Scanner;

//The process of declaring the method without method_name is known
//as Lambda Expression, which is also known as Anonymous methods.

interface IComparable3
{
	public abstract int compareTo(int x,int y);
}
class Interface4 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value1:");
		int v1 = s.nextInt();
		System.out.println("Enter the value2:");
		int v2 = s.nextInt();

		System.out.println("Choice\n1.Greater\n2.Smaller\nEnter the choice:");
		int choice = s.nextInt();
		
		if(v1==v2) {
			System.out.println("Values are Same.");
			System.exit(0);
		}
		
		switch(choice)
		{
		case 1:
			IComparable3 gt = (int x,int y)->
			{
				if(x>y) 
					return x;
				else 
					return y;
			};
			System.out.println("Greater Value:"+gt.compareTo(v1,v2));
			break;
		
		case 2:
			IComparable3 sm = (int x,int y)->
			{
				if(x<y)
					return x;
				else 
					return y;
			};
			System.out.println("Smaller Value:"+sm.compareTo(v1,v2));
			break;
		
		default:
			System.out.println("Invalid choice...");
		}
	}
}