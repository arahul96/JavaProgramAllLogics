package package2;
import java.util.Scanner;

import package1.*;

@SuppressWarnings("serial")
public class ValidateStudent extends Exception 
{
	public ValidateStudent(String msg) 
	{
		super(msg);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Branch.");

		try 
		{
			String str = sc.nextLine().toUpperCase();
			StuValidate sv = new StuValidate();

			sv.branch(str);

			System.out.println("Enter the RollNumber.");
			String str1 =sc.nextLine();
			
			System.out.println("Enter BranchCode.");
			String in = sc.nextLine();

			if(str1.length()!=2) 
			{
				ValidateStudent vs = new ValidateStudent("Invalid RollNumber");
				throw vs;
			}
			
			System.out.println("Student's Branch is: "+str);
			System.out.println("Student's Roll Number is: "+str1);
			
			if(in.compareTo("05")==0) 
			{
				System.out.println("Matching Code, for the CSC Branch is "+in+".");
			}
			
			else if(in.compareTo("04")==0)
			{
				System.out.println("Matching Code, for the ECE Branch is "+in+".");
			}
			
			else if(in.compareTo("02")==0)
			{
				System.out.println("Matching Code, for the EEE Branch is "+in+".");
			}
			
			else if(in.compareTo("03")==0)
			{
				System.out.println("Matching Code, for the MECH Branch is "+in+".");
			}
			
			else if(in.compareTo("12")==0)
			{
				System.out.println("Matching Code, for the IT Branch is "+in+".");
			}
			
			else 
			{
				ValidateStudent vs = new ValidateStudent("Invalid Branch Code.");
				throw vs;
			}
		}

		catch(ValidateStudent vs) 
		{
			System.out.println(vs.getMessage());
			vs.printStackTrace();
		}

		catch(StuValidate stv)
		{
			System.out.println(stv.getMessage());
			stv.printStackTrace();
		}

		finally 
		{
			sc.close();
		}
	}
}