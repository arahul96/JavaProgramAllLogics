package package1;

public class LSClass 
{
	private static LSClass ob = null;

	private LSClass()
	{
	}

	public static LSClass getRef()
	{
		if(ob==null)
		{
			ob = new LSClass();//Private Constructor call
		}
		return ob;
	}

	public void dis(int p)
	{
		System.out.println("dis()");
		System.out.println("The value p:"+p);
	}
	@SuppressWarnings("unused")
	private class Xyz // Private classes can be declared as only Inner Classes, which means we cannot declare Outer Classes as private.
	{

	}
}