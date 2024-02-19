package package2;

import package1.*;

public class CloningClass 
{
	public static void main(String[] args) 
	{
		Cloningclass cc = new Cloningclass("A121","Mouse");
		
		System.out.println("Original Object Cloningclass.");
		System.out.println(cc);
		System.out.println("hashCode of p1:"+cc.hashCode());
		System.out.println("ClassName:"+cc.getClass());

		Cloningclass cc1 = (Cloningclass)cc.cloning(); //step4
		
		System.out.println("Cloned Object CloningClass");
		System.out.println(cc1);
		System.out.println("hashCode of p2:"+cc1.hashCode());
		System.out.println("ClassName:"+cc1.getClass());
	}
}
