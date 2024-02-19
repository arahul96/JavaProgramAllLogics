package package1;

public class SubClass 
{
	public int a=1;
	public static int b=2;
	public void m1()
	{
		System.out.println("OuterClass method m1()");
		System.out.println("The value a:"+a);
		System.out.println("The value b:"+b);
	}
	
	public class SubClass1
	{
		public void m2()
		{
			System.out.println("InnerClass method m2()");
			System.out.println("The value a:"+a);
			System.out.println("The value b:"+b);
		}
	}
}
