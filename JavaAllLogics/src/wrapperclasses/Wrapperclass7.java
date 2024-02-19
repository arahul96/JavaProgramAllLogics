package wrapperclasses;

import java.util.Scanner;

public class Wrapperclass7 {

	public static void main(String[] args) 
	{
		try(Scanner s = new Scanner(System.in);)
		{
			System.out.println("Enter the String1:");
			String s1 = s.nextLine().trim();
			System.out.println("Enter the String2:");
			String s2 = s.nextLine().trim();
			
			System.out.println("equals() Method.");
			boolean z = s1.equalsIgnoreCase(s2);
			
			if(z)
			{
				System.out.println("Strings are equal...");
			}
			else
			{
				System.out.println("Strings are NotEqual..");
			}
			
			System.out.println("compareTo() Method.");
			int k = s1.compareToIgnoreCase(s2);
			
			if(k==0)
			{
				System.out.println("Strings are Equal...");
			}
			else if(k>0)
			{
				System.out.println("s1 is greater then s2");
			}
			else
			{
				System.out.println("s1 is less than s2");
			}
		}
	}
}
