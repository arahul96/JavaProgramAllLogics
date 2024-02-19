package wrapperclasses;

public class Stringbuffer2
{
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder("java");
		System.out.println("sb:"+sb.toString());
		System.out.println("default capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		
		sb.append("bestprogramminglanguage");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		System.out.println("insert by index");
		
		sb.insert(4,"nit");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		System.out.println("String reverse");
		
		System.out.println(sb.reverse());
		
		StringBuilder sb1 = new StringBuilder(sb);
		System.out.println("sb1:"+sb1.toString());

	}

}
