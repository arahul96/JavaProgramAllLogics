package wrapperclasses;

public class Wrapperclass5 
{
	public static void main(String[] args) 
	{
		//AutoBoxing process
		Integer ob1 = 12;
		Float ob2 = 12.56F;
		Character ob3  = 'A';
		Boolean ob4 = true;
		
		//AutoUnBoxing
		int i = ob1;
		float f = ob2;
		char ch = ob3;
		boolean b = ob4;
		
		System.out.println("Value: "+i);
        System.out.println("Value: "+f);
        System.out.println("Value: "+ch);
        System.out.println("Value: "+b);
	}
}