package Class2;

import java.util.Scanner;

public class average {
	
	void fun()
	{
	
	int Mark_Math = 0;
	int Mark_ENG = 0;
	int Mark_HINDI = 0;
	int Mark_SCI = 0;
	int Mark_SSCI = 0;
	int avg =0;
	int flag =1;
	Scanner sc = new Scanner(System.in);
	while (flag==1) {
	System.out.println("Please enter your Math Marks:");
	int M = sc.nextInt();
	Mark_Math = M;
	if (Mark_Math >=0 && Mark_Math <100)
		flag=0;
	};
	flag=1;
	while (flag==1) {
	System.out.println("Please enter your English Marks:");
	int E = sc.nextInt();
	Mark_ENG = E;
	if (Mark_ENG >=0 && Mark_ENG <100)
		flag=0;
	}
	flag=1;
	while (flag==1) {
	System.out.println("Please enter your Hindi Marks:");
	int H = sc.nextInt();
	Mark_HINDI = H;
	if (Mark_HINDI >=0 && Mark_HINDI <100)
		flag=0;
	}
	flag=1;
	while (flag==1) {
	System.out.println("Please enter your Science Marks:");
	int S = sc.nextInt();
	Mark_SCI = S;
	if (Mark_SCI >=0 && Mark_SCI <100)
		flag=0;
	}
	flag=1;
	while (flag==1) {
	System.out.println("Please enter your Social Science Marks:");
	int SS = sc.nextInt();
	Mark_SSCI = SS;
	if (Mark_SSCI >=0 && Mark_SSCI <100)
		flag=0;
	}
	
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

	}}

}
