package package2;
import package1.*;

public class ObjectString 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("deprecation")
		Integer ob1 = new Integer(1234);
		
		String ob2 = new String("Raj");
		Stringobject so = new Stringobject("12-34/h","SR Nagar");
		
		System.out.println("Display from Objects.");
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(so);
		
		System.out.println("hashCodes of Objects.");
		System.out.println("hashCode of ob1:"+ob1.hashCode());
		System.out.println("hashCode of ob2:"+ob2.hashCode());
		System.out.println("hashCode of so:"+so.hashCode());

	}
}
