package Class2;

import java.util.Scanner;

public class MrThomas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int I = 1;
		average ob = new average();
	    ob.fun();
	   
	    
//		System.out.println("Do you continue to calculate for another student (y/N) ?:");
//		char yes = sc.next().charAt(0); 
		
		
		
		
	    Scanner sc = new Scanner(System.in);
				
				while (I==1)
				{
					
					System.out.println("Do you continue to calculate for another student (y/N) ?:");
					char No = sc.next().charAt(0); 
					if (No == 'Y'|| No == 'y')
					{	I = 1; 
					ob.fun();
					}
					if (No == 'N'|| No == 'n')
				
					{	I = 0; }
					
					
				}
				
	   

	}

}