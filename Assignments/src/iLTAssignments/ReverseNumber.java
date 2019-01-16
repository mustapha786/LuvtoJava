package iLTAssignments;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int multiply(int x)
	{
		int mul=1;
		for (int i=1;i<=(x-1);i++ )
		{
			mul = mul*10;
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
		for (int i=0;i<99;i++)
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
			
		}
		
	   int a=0;
	   int a1=0;
		for (int x=0;x<count;x++)
		{
			a=multiply((count-x));
			a1 = array[x]*a;
			result = result+a1;
			
		}
		
		System.out.println("Reversed number  is :" + result);

	}

}
