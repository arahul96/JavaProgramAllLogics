//The process in which one reference is created and the reference is binded with all the 
//members of PClass and only Overriding members from the CClass,is known as Generalization.

package logicspackage;

class PClass3
{
	void m1()
	{
		System.out.println("PClass m1()");
	}
	void m2()
	{
		System.out.println("PClass m2()");
	}
}

class CClass3 extends PClass3
{
	void m1()
	{
		System.out.println("CClass m1()");
	}
	void m3()
	{
		System.out.println("CClass m3()");
	}
}

class Generalization
{
	public static void main(String[] args) 
	{
		PClass3 ob = new CClass3();//Generalization process
		ob.m1();
		ob.m2();
		//ob.m3(); Error 
	}
}
