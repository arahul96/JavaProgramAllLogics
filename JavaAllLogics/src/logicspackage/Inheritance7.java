package logicspackage;

//we use 'Extended for' or 'Enhanced for' introduced by Java5 version to 
//retrieve the data from Array objects. This 'Extended for' is auto retrieval loop.

class Inheritance7 
{
	public static void main(String[] x) 
	{
		Inheritance7.main(12.34F);//OverLoaded main() method call
		System.out.println("standard main()");
		
		for(String i : x)
		{
			System.out.println(i);
		}
	}
	
	public static void main(float k) 
	{
		System.out.println("main()");
		System.out.println("The value k:"+k);
	}
}
