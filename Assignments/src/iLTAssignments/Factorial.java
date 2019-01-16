package iLTAssignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number to calculate Factorial");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y=x;
		
		for (int i=1;i<=(y-1);i++)
		{
			x=x*i;
		}
		
		System.out.println("Factorial of "+y+ " is :"+x);
		
	}

}
  
 