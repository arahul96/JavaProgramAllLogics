package logicspackage;

import java.util.Scanner;

class PinNumber{

	boolean z=false;
	boolean verify(int pinNo)
	{
		switch(pinNo)
		{
		case 1111:z=true;
		break;
		case 2222:z=true;
		break;
		case 3333:z=true;
		break;
		}
		return z;
	}
}

class WithDraw1{
	int  bal=2000;

	void wDraw(int amt) 
	{
		if (amt > 0 && amt%10 == 0 && amt <= 2000) 
		{
			bal=bal-amt;

			System.out.println("Amount WithDrawn:"+amt);
			System.out.println("Total Balance Amount:"+bal);

			System.out.println("Transaction Successfully Completed.");
		}
		else if (amt >= 2000)
		{
			System.out.println("Enter a Vaild Amount, below 2000/-.");	
		}
		else
		{
			System.out.println("Enter a Vaild Amount.");	
		}
	}
}

class Deposit1{
	int  bal=2000;

	void deposit(int amt) 
	{
		if (amt > 0 && amt%10 == 0 && amt <= 10000 ) 
		{

			bal=bal+amt;

			System.out.println("Amount Deposited:"+amt);
			System.out.println("Total Balance Amount:"+bal);

			System.out.println("Transaction Successfully Completed.");
		}
		else if (amt >= 10000)
		{
			System.out.println("Enter a Vaild Amount, below 10,000/-.");	
		}
		else
		{
			System.out.println("Enter a Vaild Amount.");	
		}
	}
}

public class Bank {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);

		int count=0;
		xyz:

			while(true) 
			{
				System.out.println("Enter the ATM PIN.");
				int pinNo =s.nextInt();
				PinNumber pn = new PinNumber();
				boolean z = pn.verify(pinNo);

				if(z)
				{
					System.out.println("1.WithDraw\n2.Deposit\n3.Cancel");
					int choice = s.nextInt();

					switch(choice)
					{
					case 1:

						System.out.println("Enter the amount to withdraw.");
						int a1 = s.nextInt();
						WithDraw1 wd = new WithDraw1();
						wd.wDraw(a1);

						break xyz;

					case 2:

						System.out.println("Enter the amount to Deposit.");
						int a2 = s.nextInt();
						Deposit1 dp = new Deposit1();
						dp.deposit(a2);

						break xyz;
						
					case 3:
						System.out.println("Transaction Process terminated.");
						System.exit(0);
						
						break xyz;

					default:
						System.out.println("Invalid choice...");
					}
				}
				else
				{
					System.out.println("Invalid PinNumbers.");
					count++;
				}
				if(count==3)
				{
					System.out.println("Sorry! Transaction blocked temporarly.");

					break xyz;
				}

			}
	}
}