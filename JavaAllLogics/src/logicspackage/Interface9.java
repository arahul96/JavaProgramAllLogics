package logicspackage;

//These default concrete methods are available to Implementation
// classes and can be accessed with ImplClass objects.

interface Method1
{
	default void m1() {
		System.out.println("Default methof from Interface.");
		
	}
}
class PaClass1 implements Method1{
	void m2() {
		System.out.println("NonStatic methof from Interface.");
	}
}

public class Interface9 {

	public static void main(String[] args) {
		PaClass1 pa = new PaClass1();
		pa.m1();
		pa.m2();
	}
}
