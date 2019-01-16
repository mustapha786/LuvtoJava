package iLTAssignments;

import java.util.Scanner;

public class ReverseNumberdoWhile {
	public static int multiply(int x)
	{
		int mul=1;
		int i=1;
		while (i<=(x-1))
		{
			mul = mul*10;
			i++;
		}
		return mul;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int m=0;
		int o=0;
		int count=0;
		int result=0;
		int[] array = new int[10];
		Scanner sc = new Scanner (System.in);
		System.out.println("Please enter a number:");
		n=sc.nextInt();
		int i =0;
		do 
		{
			m=(n/10);
			o=(n%10);
			array[i]=o;
			if (m >=10)
			{
				n=m;
			} else
			{
				
				i=i+1;
				count = i;
				array[i]=m;
				i=99;
				count++;
			}
			i++;
		}while (i<99);
		
	   int a=0;
	   int a1=0;
	   int x=0;
		do 
		{
			a=multiply((count-x));
			a1 = array[x]*a;
			result = result+a1;
			x++;
		}while (x<count);
		
		System.out.println("Reversed number  is :" + result);

	}

}
