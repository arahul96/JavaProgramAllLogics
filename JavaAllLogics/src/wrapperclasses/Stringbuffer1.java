package wrapperclasses;

public class Stringbuffer1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer(6);
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		
		sb.append("java");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
		
		sb.append("program");
		
		System.out.println("sb:"+sb.toString());
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());
	}
}
