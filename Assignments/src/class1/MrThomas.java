package class1;

import java.util.Scanner;

public class MrThomas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Mark_Math = 0;
		int Mark_ENG = 0;
		int Mark_HINDI = 0;
		int Mark_SCI = 0;
		int Mark_SSCI = 0;
		int avg =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your Math Marks:");
		int M = sc.nextInt();
		Mark_Math = M;
		System.out.println("Please enter your English Marks:");
		int E = sc.nextInt();
		Mark_ENG = E;
		System.out.println("Please enter your Hindi Marks:");
		int H = sc.nextInt();
		Mark_HINDI = H;
		System.out.println("Please enter your Science Marks:");
		int S = sc.nextInt();
		Mark_SCI = S;
		System.out.println("Please enter your Social Science Marks:");
		int SS = sc.nextInt();
		Mark_SSCI = SS;
		
		avg=((Mark_Math + Mark_ENG + Mark_HINDI + Mark_SCI + Mark_SSCI)/5);
		
		System.out.println("Average Marks is: " + avg );
		
		if (avg < 40) {
			System.out.println("Grade is Poor" );
		} else if (avg >= 40 && avg <= 59 ) {
			System.out.println("Grade is Average" );
			
		} else if (avg >= 60 && avg <= 79 ) {
			System.out.println("Grade is Good" );
		} else if (avg >= 80 && avg <= 89 ) {
					System.out.println("Grade is very Good" );
		} else if (avg >= 90) {
			System.out.println("Grade is Excellent" );

		}
		

	}

}
