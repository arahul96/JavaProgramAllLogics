package package2;
import package1.*;

public class EarlyClass 
{
	public static void main(String[] args) 
	{
		//ESTClass ob = new ESTClass(); Since Early Instantiation object is created early.
		
		ESTClass ob = ESTClass.getRef();
		
		ob.dis(10);
	}

}
