package logicspackage;

import java.util.Scanner;

interface Arithmetics1
{
	public abstract double process(int x,int y);
}

public class Interface6 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Value1.");
		int n1 = s.nextInt();
		System.out.println("Enter Value2.");
		int n2 = s.nextInt();

		System.out.println("Choice.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision\n6.Exit");
		int choice = s.nextInt();

		switch(choice) 
		{
		case 1:
			Arithmetics1 ad = new Arithmetics1() 
			{
				public double process(int x,int y)
				{
					return x+y;
				}
			};
			System.out.println("Addition = "+ ad.process(n1,n2));
			break;
		case 2:
			Arithmetics1 sb = new Arithmetics1() 
			{
				public double process(int x,int y)
				{
					return x-y;
				}
			};
			System.out.println("Addition = "+ sb.process(n1,n2));
			break;
		case 3:
			Arithmetics1 ml = new Arithmetics1() 
			{
				public double process(int x,int y)
				{
					return x*y;
				}
			};
			System.out.println("Addition = "+ ml.process(n1,n2));
			break;
		case 4:
			Arithmetics1 di = new Arithmetics1() 
			{
				public double process(int x,int y)
				{
					return x/y;
				}
			};
			System.out.println("Addition = "+ di.process(n1,n2));
			break;
		case 5:
			Arithmetics1 md = new Arithmetics1() 
			{
				public double process(int x,int y)
				{
					return x%y;
				}
			};
			System.out.println("Addition = "+ md.process(n1,n2));
			break;
		case 6:
			System.out.println("Process Terminated.");
			System.exit(0);

		default:
			System.out.println("Enter a Valid Option.");
		}
	}
}
