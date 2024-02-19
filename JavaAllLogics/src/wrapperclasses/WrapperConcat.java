package wrapperclasses;

public class WrapperConcat 
{
	public static void main(String[] args)
	{
		String s1 = "java";
		String s2 = new String("program");
		
		System.out.println("String s1: "+s1.toString());
		System.out.println("String s2: "+s2.toString());
		
		//Concatenation process
		String s3 = s1.concat(s2);
		String s4 = s1+s2;
		
		System.out.println("After Concatenation.");
		System.out.println("String s3: "+s3.toString());
		System.out.println("String s4: "+s4.toString());
	}
}
