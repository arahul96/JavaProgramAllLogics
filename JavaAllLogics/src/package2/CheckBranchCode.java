package package2;

import java.util.Scanner;

import package1.*;

@SuppressWarnings("serial")
public class CheckBranchCode extends Exception
{
	public CheckBranchCode(String msg) 
	{
		super(msg);
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		try 
		{
			System.out.println("Enter the Roll Number.");
			String str1 = s.nextLine();

			if(str1.length()!=5)
			{
				CheckBranchCode cb = new CheckBranchCode("Invalid Roll Number.");
				throw cb;
			}
			
			System.out.println("Enter the BranchCode.");
			String str = s.nextLine();
			
			BranchCode bc = new BranchCode();
			
			bc.branch(str);
			
			System.out.println("Branch Code of the Student:" +str);
			System.out.println("RollNumber of the Student:" +str1);

		}
		

		catch(CheckBranchCode cb) 
		{
			System.out.println(cb.getMessage());
			cb.printStackTrace();
		}

		catch(BranchCode bc)
		{
			System.out.println(bc.getMessage());
			bc.printStackTrace();
		}
		finally 
		{
			s.close();
		}
	}
}
