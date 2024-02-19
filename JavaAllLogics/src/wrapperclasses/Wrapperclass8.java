package wrapperclasses;

public class Wrapperclass8 
{
	public static void main(String[] args) 
	{
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");

		System.out.println("String Literal process.");
		if(s1==s2)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are NotEqual.");
		}
		System.out.println("new Operator process.");
		if(s3==s4)
		{
			System.out.println("Strings are equal.");
		}
		else
		{
			System.out.println("Strings are NotEqual.");
		}
	}
}