package logicspackage;

class Displays //SubClass
{
	int b=20;
}

interface ITest1
{
	public static final int a=100;//Primitive datatype variable
	public static final Displays d=new Displays(); //NonPrimitive datatype variable
}

class Interface
{
	public static void main(String[] args) 
	{
		System.out.println("The value a:"+ITest1.a);
		//ITest1.a=200;//Compilation error
		System.out.println("The value b:"+ITest1.d.b);
	}
}

