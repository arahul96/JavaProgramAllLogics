package logicspackage;

interface methods
{
	static void m1()
	{
		System.out.println("Static Method from Interface.");
	}	
}

class PaClass implements methods
{
	void dis()
	{
		System.out.println("NonStatic Method from Class.");
	}

}

public class Interface8 {

	public static void main(String[] args) 
	{
		methods.m1();
		PaClass pc = new PaClass();
		pc.dis();

	}

}
