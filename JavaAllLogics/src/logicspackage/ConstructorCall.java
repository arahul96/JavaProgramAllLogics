//0-Parameter constructor from the PClass or SuperClass.
//Parameterized Constructor from the PClass or SuperClass

package logicspackage;

class PClass6
{
	PClass6()
	{
		System.out.println("PClass");
	}
	PClass6(int x)
	{
		System.out.println("PClass");
		System.out.println("The value x:"+x);
	}

}
class CClass6 extends PClass6
{
	CClass6()
	{
		System.out.println("CClass");
	}
	CClass6(int x)
	{
		super(x);//PClass con call
	}

}
class ConstructorCall
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		CClass6 ob = new CClass6();
		//CClass6 ob = new CClass6(10);
	}
}
