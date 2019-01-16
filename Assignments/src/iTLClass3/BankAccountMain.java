package iTLClass3;

import java.util.Scanner;

public class BankAccountMain {

	public static void main(String[] args) {
		
		
		 InheritedClass obj1 = new InheritedClass();
		 obj1.Set();
		 obj1.display();
		 System.out.println(" Enter Ammount You want to deposit :");
		 Scanner sc = new Scanner (System.in);
		 System.out.println("New Balance is :"+ obj1.deposit(sc.nextInt())); 
		 System.out.println(" Enter Ammount You want to Withdraw :");
		 Scanner sc1 = new Scanner (System.in);
		 System.out.println("New Balance is :"+ obj1.withdwal(sc1.nextDouble())); 
	}

}
