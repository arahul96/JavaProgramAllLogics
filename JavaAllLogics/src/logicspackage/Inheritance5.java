package logicspackage;

class PClass11
{
	static void m(int x)//Hided method
	{
		System.out.println("====PClass====");
		System.out.println("The value x:"+x);
	}
}

class CClass11 extends PClass11
{
	static void m(int y)
	{
		System.out.println("====CClass====");
		System.out.println("The value y:"+y);
	}
	@SuppressWarnings("static-access")
	void dis(int x,int y)//NonStatic method
	{
		super.m(x);//PClass method call
		this.m(y);//Same method call
	}
}

class Inheritance5
{
	public static void main(String[] args) 
	{
		CClass11 ob = new CClass11();
		ob.dis(123,124);
	}
}

