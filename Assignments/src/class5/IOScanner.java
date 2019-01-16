package class5;

import java.util.Scanner;

public class IOScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=0;
		int y=0;
		int z=0;
		String input = null;
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Pease enter first number ");
		x = scnr.nextInt();
		System.out.println("Pease enter Second  number ");
		y = scnr.nextInt();
		//System.out.println("Pease enter your name ");
		//input = scnr.next();
		
		System.out.println("First input Value :" + x);
		System.out.println("Second input Value :" + y);
		//System.out.println("Name is  :" + input);
	}

}
