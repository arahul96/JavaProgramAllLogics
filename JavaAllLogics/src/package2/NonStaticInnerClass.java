package package2;
import package1.SubClass;

public class NonStaticInnerClass {

	public static void main(String[] args)
	{
		SubClass sb = new SubClass(); //Object Creation for the OuterClass SubClass.
		sb.m1();

		SubClass.SubClass1 sb1 = sb.new SubClass1(); //Object Creation for the InnerClass SubClass1.
		sb1.m2();

	}
}
