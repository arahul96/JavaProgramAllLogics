package logicspackage;

class PClass8
{
	void m1(int a)
	{
		System.out.println("3");
		System.out.println("The value a:"+a);
	}
}
class CClass8 extends PClass8
{
	void m3(int a,int b,int c)
	{
		this.m2(a,b);
		System.out.println("1");
		System.out.println("The value c:"+c);
	}
	void m2(int a,int b)
	{
		super.m1(a);
		System.out.println("2");
		System.out.println("The value b:"+b);
	}
}
class Inheritance2
{
	public static void main(String[] args) 
	{
		CClass8 ob = new CClass8();
		ob.m3(11,12,13);
	}
}
