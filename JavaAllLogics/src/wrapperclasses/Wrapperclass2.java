package wrapperclasses;

public class Wrapperclass2 
{
	public static void main(String[] args)
	{
        //Boxing process
		Integer ob1 = Integer.valueOf(1);
		Float ob2 = Float.valueOf(1.34F);
		Character ob3 = Character.valueOf('A');
		Boolean ob4 = Boolean.valueOf(true);

		System.out.println("Value is: "+ob1);
		System.out.println("Value is: "+ob2);
		System.out.println("Value is: "+ob3);
		System.out.println("Value is: "+ob4);
	}
}
