package package2;
import java.util.Scanner;

import package1.Salary;

public class SEmployee {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s =new Scanner(System.in);
		Salary sl = new Salary();
		System.out.println("Enter the Salary.");
		int bSal = s.nextInt();
		sl.cal(bSal);	
	}
}
