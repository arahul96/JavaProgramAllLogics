package logicspackage;

//In this Generalization process also one reference is created and the reference is binded
//with all the members of Interface and only Overriding members from the ImplClass.

import java.util.Scanner;

interface IComparable1
{
	public abstract int compareTo(int x,int y);
}

class Large implements IComparable1
{
	public int compareTo(int x,int y)
	{
		if(x>y) 
			return x;
		else 
			return y;
	}
}

class Small implements IComparable1
{
	public int compareTo(int x,int y)
	{
		if(x<y) 
			return x;
		else
			return y;
	}
}

class Interface2
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
		
		if (v1==v2)
		{
			System.out.println("Values are Same.");
			System.exit(0);
		}
		
		switch(choice)
		{
		case 1:
			IComparable1 gt = new Large();
			System.out.println("Greater Value:"+gt.compareTo(v1,v2));
			break;
		case 2:
			IComparable1 sm = new Small();
			System.out.println("Smaller Value:"+sm.compareTo(v1,v2));
			break;
		default:
			System.out.println("Invalid choice...");
		}
	}
}

