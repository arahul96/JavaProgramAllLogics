package package2;
import java.util.Scanner;

import package1.*;

@SuppressWarnings("serial")
public class StuDetails extends Exception
{
	public StuDetails(String msg) 
	{
		super(msg);
	}
	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Branch.");
		try {
			String st = s.nextLine().toUpperCase();
			StuClass sc = new StuClass();

			sc.branch(st);

			System.out.println("Enter Roll Number.");
			String st1 = s.nextLine();

			if(st1.length()!=10)
			{
				StuDetails sd = new StuDetails("Invalid RollNumber");
				throw sd;
			}
			System.out.println("Student Branch:"+st);
			System.out.println("Student Roll Number:"+st1);
		}
		catch (StuDetails sd) 
		{
			System.out.println(sd.getMessage());
			sd.printStackTrace();
		} 
		catch (StuClass sce) 
		{
			System.out.println(sce.getMessage());
			sce.printStackTrace();
		}
		finally
		{
			s.close();
		}
	}
}
