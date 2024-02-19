package package2;

//forName() method is used to load the class
//at runtime or execution time, available from 'java.lang.Class'.

public class APMClass {

	public static void main(String[] args)
	{
		try 
		{
			@SuppressWarnings("rawtypes")
			Class c = Class.forName("package1.PAccess");
			@SuppressWarnings("deprecation")
			package1.PAccess pa = (package1.PAccess) c.newInstance();  // 'new' operator will create objects for the classes available at Compilation 
																       //stage and which cannot create objects for the classes loaded at runtime or execution time.
			
			pa.display();
		}

		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}

		catch(InstantiationException ie)
		{
			ie.printStackTrace();
		}

		catch(IllegalAccessException iae)
		{
			iae.printStackTrace();
		}
	}
}
