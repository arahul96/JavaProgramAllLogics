package logicspackage;

class Addition{
	int a, b, c;
	void add() {
		c =a+b;
		System.out.println("Addition of Two numbers is -"+ c);
	}
}

public class AddTwoNumbers {
	public static void main(String args[]) {
		Addition ad = new Addition();
		ad.a=4;
		ad.b=5;
		ad.add();
	}
}
