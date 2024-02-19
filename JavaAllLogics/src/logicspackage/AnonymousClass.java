package logicspackage;

//This Generalization process can be achieved by declaring the Child class 
//without name known as "Anonymous InnerClass as Class extension"

class PClass4
{
	void m1()
	{
		System.out.println("PClass m1()");
	}
	void m2()
	{
		System.out.println("PClass m2()");
	}
}

class AnonymousClass 
{
	public static void main(String[] args) 
	{
		PClass4 ob = new PClass4()
		{
			void m1()
			{
				System.out.println("CClass m1()");
			}
			@SuppressWarnings("unused")
			void m3()
			{
				System.out.println("CClass m3()");
			}
		};

		ob.m1();
		ob.m2();
		//ob.m3();//Error
	}
}

