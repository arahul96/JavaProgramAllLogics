package package2;
import package1.*;

public class AbAbAInClass 
{
	public static void main(String[] args) 
	{
		Interface2.AIClass ia = new Interface2.AIClass()
		{
			public void m1() 
			{
				System.out.println("AbstractClass inside Interface with m1 Method.");
			}
		};
		ia.m1();
		
		CAbClass.AIClass ca = new CAbClass.AIClass()
		{
			public void m2() 
			{			
				System.out.println("AbstractClass inside Class with m2 Method.");
			}
		};
		ca.m2();
		
		AbAbClass.AIClass aa = new AbAbClass.AIClass()
		{
			public void m3() 
			{
				System.out.println("AbstractClass inside AbstractClass with m3 Method.");

			}
		};
		aa.m3();
	}
}
