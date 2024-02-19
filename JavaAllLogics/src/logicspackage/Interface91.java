package logicspackage;

//These Private Concrete methods are accessed by the Non Private Concrete methods of same interface. 

interface Method2{
	private void m1()
	{
		System.out.println("Private Method m1");
	}
	private static void m2()
	{
		System.out.println("Private Method m2");
	}
	default void dis()
	{
		this.m1();
		Method2.m2();
	}
}
class PaClass3 implements Method2{
	void m3()
	{
		System.out.println("NonStatic Method m3 from Class.");
	}


}
public class Interface91 {

	public static void main(String[] args) 
	{
		PaClass3 pa =new PaClass3();
		pa.dis();
		pa.m3();
		//pa.m2();Cannot be Accessed. since, Private Methods.
	}
}
