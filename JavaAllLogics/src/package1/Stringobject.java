package package1;

public class Stringobject extends Object
{
	public String hNo,sName;
	public Stringobject(String hNo, String sName) 
	{
		this.hNo=hNo;
		this.sName=sName;
	}
	public String toString() 
	{
		return hNo+"\t"+sName;
	}
}
