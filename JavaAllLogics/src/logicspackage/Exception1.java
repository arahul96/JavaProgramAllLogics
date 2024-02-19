package logicspackage;

import java.util.*;


@SuppressWarnings("serial")
public class Exception1 extends Exception
{
	public Exception1(String msg)
	{
		super(msg);
	}

	public static void main(String[] args) 
	{
		Scanner s = new Scanner (System.in);

		try{
			System.out.println("Enter name:");
			String name = s.nextLine();
			System.out.println("Enter the empId");
			String empId = s.nextLine();
			
			switch(empId)
			{
			case "A111":
			case "A222":
			case "A333":
				break;
			default:
				Exception1 ob1 = new Exception1("Invalid empId..");
				throw ob1;
			}

			System.out.println("Enter the bSal...");
			int bSal = s.nextInt();
			
			if(bSal<5000)
			{
				Exception1 ob2 = new Exception1("Invalid bSal..."); 
				throw ob2;
			}
			System.out.println("Name:"+name);
			System.out.println("EmpId:"+empId);
			System.out.println("BSal:"+bSal);
		}

		catch(Exception1 ob)
		{
			//System.out.println(ob.getMessage());
			ob.printStackTrace();
		}

		catch(InputMismatchException ime)
		{
			System.out.println("Enter only Integer value");
		}

		finally
		{
			s.close();
		}
	}
}