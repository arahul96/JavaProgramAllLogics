package logicspackage;

import java.util.Scanner;
class Balance2
{
	double bal=2000;
	void getBal(){
		System.out.println("Balance amount is:"+bal);
	}
}
class PinNoCheck1
{
	boolean verify(int pinNo){
		boolean z =false;
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
interface Transaction1
{
	public static final Balance2 b =new Balance2();
	public static final PinNoCheck1 pnc =new PinNoCheck1();
	public abstract void process(double amt);
}
class Withdraws implements Transaction1
{

	public void process(double amt){
		System.out.println("Whidrawn Amount is:"+amt);
		b.bal =b.bal-amt;
		b.getBal();
		System.out.println("Transaction completed.....");


	}
}
class Deposits implements Transaction1
{

	public void process(double amt){
		System.out.println("Deposited amount is:"+amt);
		b.bal=b.bal+amt;
		b.getBal();
		System.out.println("Transaction Completed....");
	}
}
class InterfaceATM
{
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int count=0;

		xyz:
			while(true){
				System.out.println("Enter the pinNo");
				int pin =s.nextInt();

				boolean z=Transaction1.pnc.verify(pin);
				if(z){
					System.out.println("===Choice===");
					System.out.println("1.Withdraw\n2.Deposit");
					System.out.println("Enter the Choice");
					int choice =s.nextInt();
					switch(choice){
					case 1:

						System.out.println("Enter the amount");
						int wamt =s.nextInt();
						if(wamt >0 && wamt %100 == 0){
							Withdraws wd=new Withdraws();
							wd.process(wamt);
						}else{
							System.out.println("Enetr the valid amount");

						}
						break xyz;
					case 2:
						System.out.println("Enter the amount to deposit");
						int damt =s.nextInt();
						Deposits dp = new Deposits();
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
