package package1;

public class PrClass 
{
	private int a=100;
	private void dis(){
		System.out.println("Private method dis()");
		System.out.println("The value a:"+a);
	}
	
	public void m()
	{
		this.dis();
	}
}
