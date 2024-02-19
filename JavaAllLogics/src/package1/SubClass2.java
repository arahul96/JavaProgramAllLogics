package package1;

//The methods of static member Inner Classes can access static members of outer Class directly, 
//but the NonStatic members of Outer Class are accessed with Outer Class object_name.

public class SubClass2 
{
	public int a=1;
	public static int b=2;
	public static SubClass2 ob;
	
	public static class SubClass22
	{
		public void m2(){
			System.out.println("InnerClass method m2()");
			System.out.println("The value a:"+ob.a);
			System.out.println("The value b:"+b);
		}
		
		public static void m22(){
			System.out.println("InnerClass method m22()");
			System.out.println("The value a:"+ob.a);
			System.out.println("The value b:"+b);
		}
	}
}

