package logicspackage;

import java.util.Scanner;

import static java.lang.Math.*; 

//When we use 'static' import then static members of the class can be used 
//part of program directly without class_name or Interface_name.

//sqrt() method is used to calculate the sqrt of given number 
//and this method is available from 'java.lang.Math' class.

public class Calculate  
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value:");
		double a = s.nextDouble();
		double b = sqrt(a);
		System.out.println("SQRT of "+a+" is "+b);
	}
}
