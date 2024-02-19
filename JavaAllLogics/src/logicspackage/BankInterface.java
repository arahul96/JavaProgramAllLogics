package logicspackage;

import java.util.Scanner;

class Balance1
{
	double bal=2000;
	void getBal(){
		System.out.println("Balance amount is:"+bal);
	}
}

class PinCheck
{
	boolean verify(int pinNo)
	{
		boolean z = false;
		switch(pinNo){
		case 1111:
			z =true;
			break;
		case 2222:
			z = true;
			break;
		case 3333:
			z = true;
			break;	
		}
		return z;
	}
}

interface Transaction
{
	public static final Balance1 b =new Balance1();
	public static final PinCheck pn =new PinCheck();
	public abstract void process(double amt);
}

class WDraw implements Transaction
{
	public void process(double amt){
		if (amt > 0 && amt%10 == 0 && amt <= 2000) 
		{
			b.bal=b.bal-amt;

			System.out.println("Amount WithDrawn:"+amt);
			System.out.println("Total Balance Amount:"+b.bal);

			System.out.println("Transaction Successfully Completed.");
		}
		else if (amt >= 2000)
		{
			System.out.println("Enter an Amount, below 2000/-.");	
		}
		else
		{
			System.out.println("Enter a Vaild Amount.");	
		}
	}
}

class Ddeposit implements Transaction
{
	public void process(double amt){
		if (amt > 0 && amt%10 == 0 && amt <= 10000 ) 
		{

			b.bal=b.bal+amt;

			System.out.println("Amount Deposited:"+amt);
			System.out.println("Total Balance Amount:"+b.bal);

			System.out.println("Transaction Successfully Completed.");
		}
		else if (amt >= 10000)
		{
			System.out.println("Enter an Amount, below 10,000/-.");	
		}
		else
		{
			System.out.println("Enter a Vaild Amount.");	
		}
	}
}

public class BankInterface {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);

		int count=0;

		xyz:
			while(true){
				System.out.println("Enter the pinNo");
				int pin =s.nextInt();

				boolean z=Transaction.pn.verify(pin);
				if(z){	
					System.out.println("Choice\n1.Withdraw\n2.Deposit\nEnter the Choice.");
					int choice =s.nextInt();
					switch(choice){
					case 1:
						System.out.println("Enter the amount");
						int wamt =s.nextInt();
						WDraw wd=new WDraw();
						wd.process(wamt);
						break xyz;

					case 2:
						System.out.println("Enter the amount to deposit");
						int damt =s.nextInt();
						Ddeposit dp = new Ddeposit();
						dp.process(damt);
						break xyz;
					default:
						System.out.println("Enter The valid choice");
					}

				}else{
					System.out.println("Invalid pinNo Entered");
					count++;	
				}
				if(count == 3){
					System.out.println("Sorry:Transaction Blocked Temporarly.....");
					break xyz;
				}
			}
	}

}