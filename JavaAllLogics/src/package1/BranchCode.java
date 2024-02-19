package package1;

@SuppressWarnings("serial")
public class BranchCode extends Exception
{
	public BranchCode()
	{

	}

	public BranchCode(String msg)
	{
		super(msg);
	}

	public void branch(String str) throws BranchCode 
	{
		try 
		{
			switch(str)
			{
			case "05":
				System.out.println("Maching Branch, for the Code '"+str+ "' is 'CSC'.");
				break;

			case "04":
				System.out.println("Maching Branch, for the Code '" +str+  "' is 'ECE'.");
				break;

			case "02":
				System.out.println("Maching Branch, for the Code '" +str+  "' is 'EEE'.");
				break;

			case "03":
				System.out.println("Maching Branch, for the Code '"  +str+ "' is 'MECH'.");
				break;

			case "12":
				System.out.println("Maching Branch, for the Code '" +str+ "' is 'IT'.");
				break;

			default:
				BranchCode bc = new BranchCode("Invalid Branch Code.");
				throw bc;
			}
		}

		catch (BranchCode bc) 
		{
			throw bc;
		}
	}
}