package logicspackage;

import java.util.Scanner;

class Balance3
{
	double bal=2000;
	void getBal(){
		System.out.println("Balance amount is:"+bal);
	}
}

class PinCheck1
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

interface Transaction2
{
	public static final Balance3 b =new Balance3();
	public static final PinCheck pn =new PinCheck();
	public abstract void process(double amt);
}

public class BankInterface1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);

		int count=0;
		
		xyz:
			while(true){
				System.out.println("Enter the PinNumber.");
				int pin =s.nextInt();

				boolean z=Transaction.pn.verify(pin);
				if(z){	
					System.out.println("Choice\n1.Withdraw\n2.Deposit\n3.Cancel\nEnter the Choice.");
					int choice =s.nextInt();
					
					switch(choice){
					case 1:
						System.out.println("Enter the amount to withdraw.");
						int amtw =s.nextInt();
						Transaction2 td = new Transaction2() {
							public void process(double amt){
								if (amtw > 0 && amtw%10 == 0 && amtw <= 10000 ) 
								{

									b.bal=b.bal-amtw;

									System.out.println("Amount WithDrawn:"+amtw);
									System.out.println("Total Balance Amount:"+b.bal);

									System.out.println("Transaction Successfully Completed.");
								}
								else if (amtw >= 10000)
								{
									System.out.println("Enter an Amount, below 10,000/-.");	
								}
								else
								{
									System.out.println("Enter a vaild amount.");	
								}
							}
						};
						td.process(amtw);
						break xyz;
					case 2:
						System.out.println("Enter the amount to deposit");
						int amtd =s.nextInt();
						Transaction2 dp = new Transaction2() {
							public void process(double amt){
								if (amtd > 0 && amtd%10 == 0 && amtd <= 10000 ) 
								{
									b.bal=b.bal+amtd;

									System.out.println("Amount Deposited:"+amtd);
									System.out.println("Total Balance Amount:"+b.bal);

									System.out.println("Transaction Successfully Completed.");
								}
								else if (amtd >= 10000)
								{
									System.out.println("Enter an Amount, below 10,000/-.");	
								}
								else
								{
									System.out.println("Enter a Vaild Amount.");	
								}
							}
						};
						dp.process(amtd);
						break xyz;
					
					case 3:
						System.out.println("Transaction Process terminated.");
						System.exit(0);
						
						break xyz;
					default:
						System.out.println("Enter The valid choice");
					}

				}else{
					System.out.println("Invalid PinNo Entered");
					count++;	
				}
				if(count == 3)
				{
					System.out.println("Sorry:Transaction Blocked Temporarly.....");
					break xyz;
				}
			}
	}
}