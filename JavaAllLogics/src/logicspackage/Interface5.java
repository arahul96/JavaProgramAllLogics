package logicspackage;

import java.util.Scanner;

interface Arithmetics
{
	public abstract double process(int x,int y);
}

class Adds implements Arithmetics
{
	public double process(int x,int y)
	{
		return x+y;
	}
}

class Subs implements Arithmetics
{
	public double process(int x,int y)
	{
		return x-y;
	}
}

class Mult implements Arithmetics
{
	public double process(int x,int y)
	{
		return x*y;
	}
}

class Divs implements Arithmetics
{
	public double process(int x,int y)
	{
		return x/y;
	}
}

class ModDivs implements Arithmetics
{
	public double process(int x,int y)
	{
		return x%y;
	}
}

public class Interface5 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Value1.");
		int n1 = s.nextInt();
		System.out.println("Enter Value2.");
		int n2 = s.nextInt();

		System.out.println("Choice.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision\n6.Cancel");
		int choice = s.nextInt();

		switch(choice) 
		{
		case 1:
			Arithmetics ad = new Adds();
			System.out.println("Addition = "+ ad.process(n1,n2));
			break;
		case 2:
			Arithmetics sb = new Subs();
			System.out.println("Addition = "+ sb.process(n1,n2));
			break;
		case 3:
			Arithmetics ml = new Mult();
			System.out.println("Addition = "+ ml.process(n1,n2));
			break;
		case 4:
			Arithmetics di = new Divs();
			System.out.println("Addition = "+ di.process(n1,n2));
			break;
		case 5:
			Arithmetics md = new ModDivs();
			System.out.println("Addition = "+ md.process(n1,n2));
			break;
		case 6:
			System.out.println("Exit");
			System.exit(0);

		default:
			System.out.println("Enter a Valid Option.");

		}


	}

}
