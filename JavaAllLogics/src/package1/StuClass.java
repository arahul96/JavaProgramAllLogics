package package1;

@SuppressWarnings("serial")
public class StuClass extends Exception
{
	public StuClass()
	{
		
	}

	public StuClass(String msg) 
	{
		super(msg);
	}
	public void branch(String st) throws StuClass
	{
		try
		{
			switch(st)
			{
			case "CSE":
			case "ECE":
			case "EEE":
				break;
			default: 
				
				StuClass sce = new StuClass("Invalid Branch.");
				throw sce;
			}
		}
		catch(StuClass sce)
		{
			throw sce;
		}
	}
}
