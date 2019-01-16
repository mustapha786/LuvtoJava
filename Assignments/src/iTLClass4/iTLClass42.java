package iTLClass4;
import java.util.Scanner;

import iTLClass4A.*;

public class iTLClass42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  char ans = ' ';
		Scanner sc = new Scanner (System.in);
		Mathops Mathops1 = new Mathops();
		System.out.println("Please enter one of this option :");
		System.out.println("1 : Addition  :");
		System.out.println("2 : Substraction  :");
		System.out.println("3 : Multiplication  :");
		System.out.println("4 : Division  :");
		System.out.println("5 : Factorial  :");
		System.out.println("6 : Reversal of a number  :");
		
		do {
			System.out.println("Select one option   :");
			int n=sc.nextInt();
			if (n ==1)
			{
				double result = Mathops1.AddNumbers ( 200.5, 10.5);
				System.out.println("Addition of numbers are :" + result);
			}
			if (n ==2)
			{
				double result = Mathops1.SubNumbers ( 200.5, 10.5);
				System.out.println("Substraction of numbers are :" + result);
			}
			if (n ==3)
			{
				double result = Mathops1.MulNumbers ( 200.5, 10.5);
				System.out.println("Multiplication of numbers are :" + result);
			}
			if (n ==4)
			{
				double result = Mathops1.DivNumbers ( 200.5, 10.5);
				System.out.println("Division of numbers are :" + result);
			}
			if (n ==5)
			{
				int result = Mathops1.FactNumber (5);
				System.out.println("Factorial of numbers are :" + result);
			}
			if (n ==6)
			{
				int result = Mathops1.RevNumber (125);
				System.out.println("Reversal of numbers are :" + result);
			}
			System.out.println("Do you want to continue ? (y/n)  :");	
			Scanner sc1 = new Scanner (System.in);
			ans = sc1.next().charAt(0);
	} while (ans == 'y');

}
	}
