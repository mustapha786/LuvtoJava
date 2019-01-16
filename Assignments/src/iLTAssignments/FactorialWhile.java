package iLTAssignments;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		System.out.println("Please enter a number to calculate Factorial");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y=x;
		int i =1;
		while (i<=(y-1))
		{
			x=x*i;
			i++;
		}
		
		System.out.println("Factorial of "+y+ " is :"+x);

	}

}
