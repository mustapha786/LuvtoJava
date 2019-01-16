package iTLClass3;

import java.util.Scanner;

public final class  InheritedClass extends BankAccount {
	
	public  double deposit(double x)
	{
		double Interest1 = Accbal;
		System.out.println("Opening Balanace on Jan 1st 2018:" + Accbal);
		Interest1 = Interest1 * Interest *11;
		System.out.println("Earnes Interest as of Nov 2018:" + Interest1);
		Accbal = Accbal + Interest1;
		Accbal = Accbal + x;
		return Accbal;
	}
	public  double withdwal(double y)
	{ 
		if (typeOfAct  == 1)
		{
		if (Accbal >= y)
			{if ((Accbal -y ) >= savingMin )
				Accbal = Accbal - y;
			else {
				System.out.println("Min Bal of Saving account is : " + savingMin);
		        System.out.println("So , you can withdraw only max : " + (Accbal-savingMin));}
		
		} else 
		{
			System.out.println(" sorry , not enough fund to withdraw ");
			 
		}}
		if (typeOfAct  == 2)
		{
		if (Accbal >= y)
			{if ((Accbal -y ) >= CuringMin )
				Accbal = Accbal - y;
			else {
				System.out.println("Min Bal of Saving account is :" + CuringMin);
		        System.out.println("So , you can withdraw only max : " + (Accbal-CuringMin));}
		
		} else 
		{
			System.out.println(" sorry , not enough fund to withdraw ");
			 
		}}
		
		
		return Accbal;
	}
	public void Set()
	{
		Name = "Golam Khan ";
		AccNum = 1902901901;
		Accbal = 100;
		
		 System.out.println("Please enter Type of Bank Account :");
		 System.out.println("Enter 1 for Saving and 2 for Current Account :");
		 Scanner sc = new Scanner (System.in);
		 typeOfAct = sc.nextInt();
		 if ( typeOfAct  == 1)
		 {
			 Interest = 0.04; 
		 } else
		 {
			 Interest = 0;  
		 }
	}
	
	public void display()
	{
		System.out.println(" Account Number : " + AccNum);
		System.out.println(" Name of the account Holder :" + Name);
		if ( typeOfAct  == 1)
		 {
			System.out.println(" Type of account is  Saving  Account : ");
		 } else
		 {
			 System.out.println(" Type of account is  Current  Account : ");
		 }
			
		
		System.out.println(" Account Balance is  : " + Accbal);
	}
	
}
