package wrapperclasses;

public class Wrapperclass 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		Integer i = new Integer(1);
		Integer i1 = new Integer(2);
		Float f = new Float(1.1F);
		Character ch = new Character('a');

//		Integer ob1 = Integer.valueOf(1);
//		Float ob2 = Float.valueOf(1.34F);
//		Character ob3 = Character.valueOf('A');
//		Boolean ob4 = Boolean.valueOf(true);

//		Integer ob1 = 12;
//		System.out.println("Value is: "+ob1.toString());

		//Boxing Process
//		Integer ob1 = new Integer(12);
		//UnBoxing Process
//		int i = ob1.intValue();
//		System.out.println("Value: "+i);

		//AutoBoxing process
//		Integer ob1 = 12;
		//AutoUnBoxing
//		int i = ob1;
//		System.out.println("Value: "+i);
		
		System.out.println("Value:"+i);
		System.out.println("Value:"+i1);
		System.out.println("Value:"+f);
		System.out.println("Value:"+ch);
		
	}
}
