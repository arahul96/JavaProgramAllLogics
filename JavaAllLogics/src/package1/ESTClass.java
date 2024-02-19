package package1;

public class ESTClass 
{
	private static ESTClass ob = null;
	
	private ESTClass()
	{
		
	}
	
	static
	{
		ob = new ESTClass();//Private Constructor call 
	}
	public static ESTClass getRef()
	{
		return ob;
	}
	
	public void dis(int p)
	{
		System.out.println("dis()");
		System.out.println("The value p:"+p);
	}

}
