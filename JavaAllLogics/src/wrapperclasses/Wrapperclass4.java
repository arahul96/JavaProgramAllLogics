package wrapperclasses;

public class Wrapperclass4 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		//Boxing Process
		Integer ob1 = new Integer(12);
		Float ob2 = new Float(12.56F);
		Character ob3  = new Character('A');
		Boolean ob4 = new Boolean(true);
		
		//UnBoxing Process
		int i = ob1.intValue();
		float f = ob2.floatValue();
		char ch = ob3.charValue();
		boolean b = ob4.booleanValue();
		
		System.out.println("Value: "+i);
        System.out.println("Value: "+f);
        System.out.println("Value: "+ch);
        System.out.println("Value: "+b);


	}
}
