package logicspackage;

class PClass7
{
	PClass7(int a)
	{
		System.out.println("1");
		System.out.println("The value a:"+a);
	}
	PClass7(int a,int b)
	{
		this(a);
		System.out.println("2");
		System.out.println("The value b:"+b);
	}
}

class CClass7 extends PClass7
{
	CClass7(int a,int b,int c)
	{
		super(a,b);
		System.out.println("3");
		System.out.println("The value c:"+c);
	}
	CClass7(int a,int b,int c,int d)
	{
		this(a,b,c);
		System.out.println("4");
		System.out.println("The value d:"+d);
	}
}

class Inheritance 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		CClass7 ob = new CClass7(11,12,13,14);//CClass con call
	}
}
