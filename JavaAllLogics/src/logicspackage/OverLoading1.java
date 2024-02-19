package logicspackage;

class PClass1
{
	void m(int x,int y)
	{
		System.out.println("PClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
}
class CClass1 extends PClass1
{
	void m(int x,float y)
	{
		System.out.println("CClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	void m(int x,int y,int z)
	{
		System.out.println("CClass");
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);
	}
}
class OverLoading1 
{
	public static void main(String[] args) 
	{
		CClass1 ob = new CClass1();
		ob.m(1,2);
		ob.m(1,2.3F);
		ob.m(1,2,3);
	}
}
