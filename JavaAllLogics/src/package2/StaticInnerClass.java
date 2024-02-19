package package2;

import package1.SubClass2;

public class StaticInnerClass {

	public static void main(String[] args) 
	{
		SubClass2.ob = new SubClass2();
		
		SubClass2.SubClass22 ob2 = new SubClass2.SubClass22();
		
		ob2.m2();
		
		SubClass2.SubClass22.m22();
	}
}
