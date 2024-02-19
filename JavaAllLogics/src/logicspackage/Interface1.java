package logicspackage;

import java.util.Scanner;

interface IComparable
{
	public abstract int compareTo(int x,int y);
}

class Greater implements IComparable
{
	public int compareTo(int x,int y)
	{
		if(x>y) 
			return x;
		else 
			return y;
	}
}

class Smaller implements IComparable
{
	public int compareTo(int x,int y)
	{
		if(x<y) 
			return x;
		else 
			return y;
	}
}

class Interface1 
{
	public static void main(String[] args) 
	{
		//IComparable ob = new IComparable();//Error since it an Interface.

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
			System.out.println("Values are same.");
			System.exit(0);
		}

		switch(choice)
		{
		case 1:
			Greater gt = new Greater();
			System.out.println("Greater Value:"+gt.compareTo(v1,v2));
			break;
		case 2:
			Smaller sm = new Smaller();
			System.out.println("Smaller Value:"+sm.compareTo(v1,v2));
			break;
		default:
			System.out.println("Invalid choice...");
		}
	}
}
