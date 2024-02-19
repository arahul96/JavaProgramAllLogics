package logicspackage;

import java.util.Scanner;

interface Arithmetics2
{
	public abstract double process(int x,int y);
}

public class Interface7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Value1.");
		int n1 = s.nextInt();
		System.out.println("Enter Value2.");
		int n2 = s.nextInt();

		System.out.println("Choice.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModDivision\n6.Exit");
		int choice = s.nextInt();

		switch(choice) 
		{
		case 1:
			Arithmetics2 ad = (int x,int y)->
			{
				return x+y;
			};
			System.out.println("Addition:"+ad.process(n1,n2));
			break;
		case 2:
			Arithmetics2 sb = (int x,int y)->
			{
				return x-y;
			};
			System.out.println("Addition:"+sb.process(n1,n2));
			break;
		case 3:
			Arithmetics2 ml = (int x,int y)->
			{
				return x*y;
			};
			System.out.println("Addition:"+ml.process(n1,n2));
			break;
		case 4:
			Arithmetics2 di = (int x,int y)->			{
				return x/y;
			};
			System.out.println("Addition:"+di.process(n1,n2));
			break;
		case 5:
			Arithmetics2 md = (int x,int y)->
			{
				return x%y;
			};
			System.out.println("Addition:"+md.process(n1,n2));
			break;
		case 6:
			System.out.println("Process Terminated.");
			System.exit(0);

		default:
			System.out.println("Enter a Valid Option.");
		}
	}
}