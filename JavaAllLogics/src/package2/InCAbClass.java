package package2;
import package1.*;

public class InCAbClass 
{
	public static void main(String[] args) 
	{
		InClass.Interface2 ii = new InClass.Interface2()
		{
			public void m1() 
			{
				System.out.println("m1 Method from Inner Interface of Class.");
			}
		};
		ii.m1();

		Interface.Interface2 ii2 = new Interface.Interface2()
		{
			public void m2() 
			{
				System.out.println("m2 Method from Inner Interface of Interface.");
			}
		};
		ii2.m2();

		AbInClass.Interface2 ai = new AbInClass.Interface2()
		{
			public void m3() 
			{
				System.out.println("m1 Method from Inner Interface of AbstractClass.");
			}
		};
		ai.m3();
	}
}
