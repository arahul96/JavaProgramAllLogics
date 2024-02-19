package logicspackage;

class PClass
{
	int a;
	void m1()
	{
		System.out.println("Parent PClass m1()");
		System.out.println("The value a:"+a);
		//System.out.println("The value b:"+b);
	}
	static
	{
		System.out.println("Parent CClass Static block.");
	}
	{
		System.out.println("Parent PClass NonStatic block.");
	}
}

class CClass extends PClass
{
	int b;
	void m2()
	{
		System.out.println("Child CClass m2()");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
	static
	{
		System.out.println("Child CClass Static block.");
	}
	{
		System.out.println("Child CClass NonStatic block.");
	}
}

class Inheritance1 
{
	public static void main(String[] args) 
	{
		CClass ob = new CClass();//Normal Inheritance
		ob.a=12;
		ob.b=13;
		ob.m1();
		ob.m2();
	}
}
