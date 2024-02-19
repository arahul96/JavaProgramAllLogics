package package2;
import package1.*;

public class LateClass 
{
	public static void main(String[] args) 
	{
		LSClass ob = LSClass.getRef();
		ob.dis(100);
	}
}
