package package2;
import package1.*;

public class PrivateClass 
{
	public static void main(String[] args)
	{
		PrClass pr = new PrClass();
		
	//	pr.dis();    // Since Private Method.
		
		pr.m();
	}
}
