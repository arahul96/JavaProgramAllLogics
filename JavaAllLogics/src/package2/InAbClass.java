package package2;
import package1.*;

public class InAbClass 
{
	public static void main(String[] args) 
	{
		IAClass.SubClass ia = new IAClass.SubClass();
		ia.m2();
		
		Interface1.SubClass is = new Interface1.SubClass();
		is.m2();
	}
}
