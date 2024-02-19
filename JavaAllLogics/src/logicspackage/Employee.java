//REFERENCES CONCEPT.
package logicspackage;

import java.util.Scanner;

class Address{
	String hno, city, state;
	int pinCode;
	void add() {
		System.out.println("House No:" +hno+ "\nState:" +state+ "\nCity:" +city+ "\nPinCode:" +pinCode);
	}
}

class Employ{
	String eName,eId;
	Address ad = new Address();
	void emp() {
		System.out.println("Employee ID:" +eId+ "\nEmployeeName:" +eName);
	}
}

class Read{
	void read(Scanner s, Employ e)
	{
		System.out.println("Enter Emp ID");
		e.eId = s.nextLine();
		System.out.println("Enter Emp Name");
		e.eName = s.nextLine();
		System.out.println("Enter House No");
		e.ad.hno = s.nextLine();
		System.out.println("Enter City");
		e.ad.city = s.nextLine();
		System.out.println("Enter State");
		e.ad.state = s.nextLine();
		System.out.println("Enter PinCode");
		e.ad.pinCode = s.nextInt();
	}
}

class Display{
	void dis(Employ e) {
		e.emp();
		e.ad.add();
	}
}

public class Employee {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Employ e = new Employ();
		Read r =new Read();
		r.read(s,e);
		Display d =new Display();
		d.dis(e);
	}
}
