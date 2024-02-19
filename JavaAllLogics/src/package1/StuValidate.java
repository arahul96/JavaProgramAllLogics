package package1;

@SuppressWarnings("serial")
public class StuValidate extends Exception
{
	public StuValidate()
	{

	}
	public StuValidate(String msg)
	{
		super(msg);
	}
	
	public void branch(String str) throws StuValidate 
	{
		try 
		{
			switch(str)
			{
			case "CSC":
			case "EEE":
			case "ECE":
			case "MECH":
			case "IT":
				break;

			default:
				StuValidate stv = new StuValidate("Invalid Branch.");
				throw stv;
			}
		}

		catch (StuValidate stv) 
		{
			throw stv;
		}
	}
}
