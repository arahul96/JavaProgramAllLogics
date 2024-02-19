package logicspackage;

class PClass9
{
	static int a;
	static void m1()
	{
		System.out.println("PClass");
		System.out.println("The value a:"+a);
	}
	static
	{
		System.out.println("PClass static block");
	}
}

class CClass9 extends PClass9
{
	static int b;
	static void m2()
	{
		System.out.println("CClass");
		System.out.println("The value b:"+b);
	}
	static
	{
		System.out.println("CClass static block");
	}
}

class Inheritance3
{
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		CClass9 ob = new CClass9();
		
		PClass9.a=12;
		ob.a=12;
		CClass9.b=13;
		ob.b=13;
		PClass9.m1();
		ob.m1();
		CClass9.m2();
		ob.m2();
	}
}

