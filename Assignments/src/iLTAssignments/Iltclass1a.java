package iLTAssignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Iltclass1a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age > 18)
		{
			System.out.println("Congratulations!!! , You are eligible to vote");
			
		} else
		{
			System.out.println("Sorry , You have to be 18 years old to be able to vote");
		}
			
		System.out.println("Please enter a number");
		Scanner sc1 = new Scanner(System.in);
		int number = sc.nextInt();
		if ( number >0)
		{
			System.out.println("You have entered a positive number");
		} else 
			if (number ==0)
		
		{
			System.out.println("You have entered zero ");
		} else
		{
			System.out.println("You have entered a negative number ");
		}
		
		System.out.println("Please enter 2 number with coma seperated");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		String input = buff.readLine();
		StringTokenizer tkn = new StringTokenizer(input,",");
		int x = Integer.parseInt(tkn.nextToken());
		int y = Integer.parseInt(tkn.nextToken());
		System.out.println("Entered Values are " + x +"," +y);
		if ( x>y)
		{
			System.out.println(x+ " is greater than "+y);
		}else
			 {
				System.out.println(y+ " is greater than "+x);
			}
		
		int remain;
		remain = age%2;
		if (remain ==0)
		{
			System.out.println("Your age is even number");
			
		} else
		{
			System.out.println("Your age is odd number");
		}
		
	}

}
