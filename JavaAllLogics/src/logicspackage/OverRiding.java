package logicspackage;

class Parent2
{
	void pClass(int a, int b) 
	{
		System.out.println("Parent Class.");
		System.out.println("Adding:"+ (a+b));
	}
}

class Child2 extends Parent2
{
	void pClass(int a, int b) 
	{
		System.out.println("Child Class method1.");
		System.out.println("Adding:"+ (a+b));
	}
	void pClass(int a, int b, int c) 
	{
		System.out.println("Child Class method2.");
		System.out.println("Adding:"+ (a+b+c));
	}

}

public class OverRiding 
{

	public static void main(String[] args) 
	{
		Child2 ch = new Child2();
		
		ch.pClass(1, 2);
		ch.pClass(1, 2, 3);

	}
}
