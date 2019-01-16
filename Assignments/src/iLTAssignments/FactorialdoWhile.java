package iLTAssignments;

import java.util.Scanner;

public class FactorialdoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number to calculate Factorial");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y=x;
		int i =1;
		do 
		{
			x=x*i;
			i++;
		}while (i<=(y-1));
		
		System.out.println("Factorial of "+y+ " is :"+x);

	}

}
