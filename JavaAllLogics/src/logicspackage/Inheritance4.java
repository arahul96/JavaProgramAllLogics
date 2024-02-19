package logicspackage;

//when we have same static method signature in PClass and CClass, then PClass method
//is hided by CClass method while execution, is known as Method Hiding process.
//we can access static members of PClass using 'super' keyword, but the 'super' 
//keyword must be declared within the NonStatic members of CClass.

class PClass10
{
	static void m(int x)//Hided method
	{
		System.out.println("PClass");
		System.out.println("The value x:"+x);
	}
}
class CClass10 extends PClass10
{
	static void m(int x)
	{
		System.out.println("CClass");
		System.out.println("The value x:"+x);
	}
}
class Inheritance4
{
	public static void main(String[] args) 
	{
		CClass10.m(123);
	}
}
