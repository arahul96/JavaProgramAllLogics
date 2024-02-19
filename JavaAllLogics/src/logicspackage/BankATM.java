package logicspackage;

import java.util.Scanner;

class Balance 
{
	double bal=2000;
	void getBal()
	{
		System.out.println("Bal amt:" +bal);
	}
}

class PinNoCheck
{
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

class WithDraw 
{
	Balance b;
	WithDraw(Balance b)
	{
		this.b=b;
	}
	void wDraw(int amt)
	{
		if(amt<=b.bal)
		{
			System.out.println("Amt withDrawn:"+amt);
			b.bal=b.bal-amt;
			b.getBal();
			System.out.println("Transaction Completed.");
		}
		else
		{
			System.out.println("InSufficient fund.");
		}
	}
}

class Deposit 
{
	Balance b;
	Deposit(Balance b)
	{
		this.b=b;
	}
	void deposit(int amt)
	{
		System.out.println("Amt deposited:"+amt);

		b.bal=b.bal+amt;
		b.getBal();

		System.out.println("Transaction completed.");
	}
}

class BankATM 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Balance b = new Balance();
		int count=0;
		xyz:
			while(true){
				System.out.println("Enter the pinNo:");
				int pinNo = s.nextInt();
				PinNoCheck pnc = new PinNoCheck();
				boolean z = pnc.verify(pinNo);
				if(z)
				{
					System.out.println("\"====Choice===\"\n1.WithDraw\n2.Deposit");
					System.out.println("Enter the choice:");

					int choice = s.nextInt();
					switch(choice)
					{

					case 1:
						System.out.println("Enter the amt:");
						int a1 = s.nextInt();
						if(a1>0 && a1%100==0)
						{
							WithDraw wd = new WithDraw(b);
							wd.wDraw(a1);
						}
						else
						{
							System.out.println("Invalid amt.");
						}
						break xyz;

					case 2:
						System.out.println("Enter the amt:");
						int a2 = s.nextInt();
						if(a2>0 && a2%100==0)
						{
							Deposit dp = new Deposit(b);
							dp.deposit(a2);
						}
						else
						{
							System.out.println("Invalid amt.");
						}
						break xyz;

					default:
						System.out.println("Invalid choice.");
						break xyz;
					}
				}
				else
				{
					System.out.println("InValid pinNo.");
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
