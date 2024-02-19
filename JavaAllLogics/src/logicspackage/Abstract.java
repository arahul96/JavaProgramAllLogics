package logicspackage;

import java.util.Scanner;

abstract class ABClass
{
	double a,b;
	ABClass(double a)
	{
		this.a=a;
	}
	void m1() 
	{
		b = Math.sqrt(a);
	}
	abstract void dis();
}

class ChClass extends ABClass
{
	ChClass(double a)
	{
		super(a);
	}

	//@Override
	void dis() {
		System.out.println("The sqrt of "+a+" is "+b);
	}
}

public class Abstract 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value a:");
		double a = s.nextDouble();

		ChClass ch = new ChClass(a);
		ch.m1();
		ch.dis();
	}
}
