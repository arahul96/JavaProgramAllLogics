package logicspackage;

import java.util.*;

@SuppressWarnings("serial")
public class EException extends Exception 
{
	public EException(String msg)
	{
		super(msg);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try {
			System.out.println("Enter the Name.");
			String st = s.nextLine();
			System.out.println("Enter ID.");
			String st1 = s.nextLine();

			switch(st1) 
			{
			case "A111": break;
			case "A222": break;
			case "A333": break;

			default:
				EException ob = new EException("Invalid EmployeeID");
				throw ob;
			}

			System.out.println("Enter the Salary.");
			float ft = s.nextFloat();

			if(ft<5000)
			{
				EException ob = new EException("Invalid Salary.");
				throw ob;
			}
			else
			{
				System.out.println("Employee Name:" + st);
				System.out.println("Employee ID:" + st1);
				System.out.println("Employee Salary:" + ft);
			}
		}	

		catch(EException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		finally 
		{
			s.close();
		}
	}
}