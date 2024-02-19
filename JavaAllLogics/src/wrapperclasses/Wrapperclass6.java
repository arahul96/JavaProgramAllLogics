package wrapperclasses;

import java.util.Scanner;

public class Wrapperclass6 
{
	public static void main(String[] args)
	{
		try(Scanner s = new Scanner(System.in);)
		{
			System.out.println("Enter the String:");
			String str = s.nextLine();
			
			int count=0;

			for(int i=0;i<str.length();i++)
			{
				switch(str.charAt(i))
				{
				case 'a':
				case 'A':count++;
				break;
				case 'e':
				case 'E':count++;
				break;
				case 'i':
				case 'I':count++;
				break;
				case 'o':
				case 'O':count++;
				break;
				case 'u':
				case 'U':count++;
				break;
				}
			}
			System.out.println("No of Vowels:"+count);
		}
	}
}