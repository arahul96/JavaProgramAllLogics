package logicspackage;

import java.util.Scanner;

class Add{
	int add(int x, int y) {
		return x+y;
	}
}
class Sub{
	int sub(int x, int y) {
		return x-y;
	}
}
class Mul{
	int mul(int x, int y) {
		return x*y;
	}
}
class Div{
	float div(int x, int y) {
		return x/y;
	}
}
class ModDiv{
	int mod(int x, int y) {
		return x%y;
	}
}

public class ArithmeticModes {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value1:");
		int n1 = sc.nextInt();

		System.out.println("Enter the value2:");
		int n2 = sc.nextInt();

		while(true){
			System.out.println("Select from below options:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.ModuluDivision\n6.Exit");
			System.out.println("Enter the choice:");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				Add ad = new Add();
				System.out.println("Sum of two digits is:"+ad.add(n1,n2));
				break;
			case 2:
				Sub sb = new Sub();
				System.out.println("Sub of two digits is:"+sb.sub(n1,n2));
				break;
			case 3:
				Mul ml = new Mul();
				System.out.println("Mul of two digits is:"+ml.mul(n1,n2));
				break;
			case 4:
				Div dv = new Div();
				System.out.println("Div of two digits is:"+dv.div(n1,n2));
				break;
			case 5:
				ModDiv md = new ModDiv();
				System.out.println("ModDiv of two digits is:"+md.mod(n1,n2));
				break;
			case 6:
				System.exit(0); //Exit's the Program.
				break;
			default:
				System.out.println("Invalid choice...");
			}
		}
	}
}