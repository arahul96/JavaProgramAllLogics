package logicspackage;

class PClass12
{
	static void m(int x,int y)
	{
		System.out.println("PClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}

class CClass12 extends PClass12
{
	static void m(int x,float y)
	{
		System.out.println("CClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	static void m(int x,int y,int z)
	{
		System.out.println("CClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
}

class Inheritance6
{
	public static void main(String[] args) 
	{
		CClass12.m(1,2);
		CClass12.m(1,2.3F);
		CClass12.m(1,2,3);
	}
}
