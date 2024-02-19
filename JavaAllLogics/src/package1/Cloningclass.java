package package1;

public class Cloningclass extends Object implements Cloneable //step1
{
	public String pCode,pName;
	public Cloningclass(String pCode,String pName)
	{
		this.pCode=pCode;
		this.pName=pName;
	}
	@Override
	public String toString()
	{
		return "PCode:"+pCode+"\nPName:"+pName;
	}
	public Object cloning() //step2
	{
		Object o=null;
		
		try
		{
			o = super.clone();//step3
		}
		catch(CloneNotSupportedException cse)
		{
			cse.printStackTrace();
		}
		return o;
	}

}
