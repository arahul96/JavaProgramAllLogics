package package2;

//import package1.Result;
//import package1.Comparable;
import package1.*;

import java.util.Scanner;

public class AnnInnerClass {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Result r = new Result();

		System.out.println("Enter value1.");
		int n1 = s.nextInt();
		System.out.println("Enter value1.");
		int n2 = s.nextInt();

		if(n1==n2) 
		{
			System.out.println("Values are Equal.");
			System.exit(0);
		}

		System.out.println("Choice\n1.Greater.\n2.Smaller.\n3.Exit\nEnter any Choice");
		int choice = s.nextInt();

		switch(choice) 
		{
		case 1:
			System.out.println("Greated Selected.");
			r.result( n1,  n2, (int x, int y)->
			{
				if(x>y)
					return x;
				else 
					return y;
			});
			break;
		
		case 2:
			System.out.println("Greated Selected.");
			r.result( n1,  n2, (int x, int y)->
			{
				if(x<y)
					return x;
				else 
					return y;
			});
			break;
		
		case 3:
			System.out.println("Terminated.");
			break;
		
		default:
			System.out.println("Invalid Choice.");
		}

	}
}
