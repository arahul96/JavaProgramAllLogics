package package1;

public class Salary 
{
	public float tSal;
	public void cal(int bSal) 
	{
		tSal = bSal+(0.9F*bSal)+(0.6F*bSal);
		System.out.println("Total Salary of the Employee:" + tSal);
	}
}
