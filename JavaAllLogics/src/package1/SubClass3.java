package package1;

//Class declaration, Object creation and method access
//must be done inside the method of Outer Class.

public class SubClass3
{
	public int a=10;
	public static int b=20;
	
	public void m1(){
		
		class SubClass33
		{
			public void m2()
			{
				System.out.println("Local InnerClass method m2()");
				System.out.println("The value a:"+a);
				System.out.println("The value b:"+b);
			}
		}
		SubClass33 ob2 = new SubClass33();
		ob2.m2();
	}
}
