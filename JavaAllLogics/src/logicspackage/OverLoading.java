package logicspackage;

import java.util.Scanner;

class Parent{

	void pClass(int a, int b) {
		System.out.println("Parent Class.");
		System.out.println("Parent Output:" +(a+b));
	}
}

class Child extends Parent{

	void pClass(float a, int c) {
		System.out.println("Child Class.");
		System.out.println("Child Output:" +(a+c));
	}	
	void pClass(int a, int b,int c) {
		System.out.println("Child Class.");
		System.out.println("Child Output:" +(a+b+c));
	}	
}

public class OverLoading {

	public static void main(String[] args) {

		Child ch = new Child();
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);


		System.out.println("Enter value1");
		
		//float a = s.nextFloat();
		int a = s.nextInt();
		
		System.out.println("Enter value2");
		int b = s.nextInt();
		System.out.println("Enter value3");
		int c = s.nextInt();

		ch.pClass(a,b);
		ch.pClass(a,c);
		ch.pClass(a,b,c);
	}
}
