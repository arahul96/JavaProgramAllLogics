package logicspackage;

import java.util.Scanner;

class Additing{
	int add(int x, int y) {
		return x+y;
	}
}
class Subtraction{
	int sub(int x, int y) {
		return x-y;
	}
}
class Multiplication{
	int mul(int x, int y) {
		return x*y;
	}
}
class Division{
	int div(int x, int y) {
		return x/y;
	}
}
class ModDivision{
	int mod(int x, int y) {
		return x%y;
	}
}

public class Arithmetic {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number");
		int n1 = sc.nextInt();

		System.out.println("Enter second number");
		int n2 = sc.nextInt();

		Additing ad = new Additing();
		Subtraction su = new Subtraction();
		Multiplication mu =new Multiplication();
		Division di = new Division();
		ModDivision md = new ModDivision();

		System.out.println("Addition = "+ad.add(n1,n2));
		System.out.println("Subtraction = "+su.sub(n1,n2));
		System.out.println("Multiplication = "+mu.mul(n1,n2));
		System.out.println("Division = "+di.div(n1,n2));
		System.out.println("Mod Division = "+md.mod(n1,n2));
	}

}
