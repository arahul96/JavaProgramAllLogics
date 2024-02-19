package logicspackage;

public class EException1 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Val:"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
		}
		System.out.println("Execution Completed.");
	}
}
