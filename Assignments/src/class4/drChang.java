package class4;

import java.util.Scanner;

public class drChang {

	private static int max_p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Days Days_of_Week[] = Days.values();
	//	for (Days  a: Days_of_Week )
	// {
	//   System.out.println(a);
	// }
	//	System.out.println("Day is :" + Days_of_Week[1] );
	 
		
	// input collection 
	//	System.out.println("Please enter day starting letter as capital :");
	//	String day_name = new Scanner(System.in).nextLine();
		
	//	int y = Days.valueOf(day_name).ordinal();
	//	System.out.println("Day is :" + Days.valueOf(day_name).ordinal() );
		
		String NameofPatient [][] = new String[7][50];
		int max_pt [] = new int [7];
	//	System.out.println("Please enter maximum number of patient called on this day");
	//	int max_p = new Scanner(System.in).nextInt();
		
//		for (int i=0;i<max_p;i++)
	//	{
		//	System.out.println("Please enter" + i + "Patient :");
	//		String P_name = new Scanner(System.in).nextLine();
	//		NameofPatient [y][i] = P_name;
	//	}
		
		// Print the Report 
//		System.out.println("All Patients for  :" + day_name );
//		int j = 1;
	//	for (int i=0;i<max_p;i++)
	//	{
//			System.out.println( j + "--" + NameofPatient [y][i]);
	//		j++;
			
//		}
		int max_p = 0;
		int b =1;
		for ( int a=0 ; a<=6 ; a++)
		{
			if (b==1)
			{
				System.out.println("Day of the week is:" + Days_of_Week[a]);
				System.out.println("Please enter maximum number of patients called on this day");
				max_p = new Scanner(System.in).nextInt();
				max_pt [a]=max_p;
					b =0;
			}
				
			if (max_p ==0)
			{
				b =1;
					continue;
			}
			for (int c=0 ; c <= (max_p-1) ; c++)
			{
				System.out.println("Please enter " + (c+1) + " Patient :");
				String P_name = new Scanner(System.in).nextLine();
				
				NameofPatient [a][c] = P_name;
				if ( c== (max_p -1))
				{
					if (a==6)
					break;
					else
					b=1;
				}
			}
			
		}
	
		System.out.println("Data Capture Finishes Here :");
		System.out.println("=====Weekly Patients Report ===== :");
	//	System.out.println("size of array:"+NameofPatient.length);
		
		for (int x=0;x<=6;x++ )
		{
			System.out.println("Report for  :" + Days_of_Week[x]);
			for (int z=0;z<max_pt[x];z++ )
			{
				int n = z+1;
				System.out.println( n + "--" + NameofPatient[x][z] );
			}
		}
		
	}


	
	
//enum Days_of_Week { Sunday , Monday, Tuesday , Wednesday , Thursday , Friday , Saturday };



}
