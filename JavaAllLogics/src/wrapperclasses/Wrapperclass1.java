package wrapperclasses;

public class Wrapperclass1 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		Float f = new Float(1.1F);
		Float f1 = new Float(2.2F);
		Float f2 = new Float(3.3F);
		Character ch = new Character('a');
		
		System.out.println("Value2:"+f);
		System.out.println("Value2:"+f1);
		System.out.println("Value2:"+f2);
		System.out.println("Value:"+ch);
		
		System.out.println("Value:" +f.toString());
		System.out.println("Value:" +f1.toString());
		System.out.println("Value:" +f2.toString());
		System.out.println("Value:" +ch.toString());
	}
}
