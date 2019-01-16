package iLTAssignments;

import java.util.Scanner;

public class Adddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int count =0;
		int a=0;
		int b=x;
		do {
		count = count +1; 
		a=(b/10);
		b=a;
		} while (a>=10);
		if (x>=10)
		{
		count = count +1;
		}
		System.out.println("Number of digits:" + count);
		int y = count;
		
//		System.out.println("Number of digits entered for the number ");
//		int y =  scan.nextInt();
//		System.out.println(y);
		int z=1;
		for (int i=1;i<=(y-1);i++)
		{
			z=z*10;
		}
	//	System.out.println(z);
		int m =0;
		int n =0;
		int sum=0;
		if (z==1)
		{
			System.out.println("sum of digits is :" +x);
		}
		else
		{
			do {
				m= (x/z);
				n= (x%z);
				sum=sum+m;
				z=z/10;
				x=n;
			} while (n>10);
			System.out.println("sum of digits is :" + (sum+n));
		}
	}

}
