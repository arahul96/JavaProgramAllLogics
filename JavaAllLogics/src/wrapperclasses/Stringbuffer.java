package wrapperclasses;

public class Stringbuffer {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer();
		System.out.println("default capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		
		sb.append("javaprogram");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		
		sb.append("language");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());

	}

}
