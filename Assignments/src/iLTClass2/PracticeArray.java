package iLTClass2;

public class PracticeArray {
	
	public static void display (String [] dempID , String [] dempName , double [] dempSal)
	{
		for (int i=0;i<=4;i++)
		{
			System.out.println(dempID[i] + "      " + dempName[i] + "       "+dempSal[i]  );
		}
	};

	public static void display (String [] dempID , String [] dempName )
	{
		for (int i=0;i<=4;i++)
		{
			System.out.println(dempID[i] + "      " + dempName[i] );
		}
	};
	public static void display1 (String Name, String [] dempID , String [] dempName , double [] dempSal)
	{
		for (int i=0;i<=4;i++)
		{
			if (dempName[i] == Name )
			{
			System.out.println(dempID[i] + "      " + dempName[i] + "       "+dempSal[i]  );
			i=4;
			};
		}
	};
	
	public static void main(String[] args) {
		 String empId [] = new String [5];
		 String empName [] = new String [5];
		 double empSal [] = new double [5];
		 String Name = null;
		 
		 empId[0]="00 ";
		 empId[1]="002";
		 empId[2]="003";
		 empId[3]="004";
		 empId[4]="005";
		 empName [0]  = "John ";
		 empName [1]  = "Clark";
		 empName [2]  = "Nancy";
		 empName [3]  = "Joe  ";
		 empName [4]  = "Mary ";
		 empSal [0] = 600000;
		 empSal [1] = 550000;
		 empSal [2] = 500000;
		 empSal [3] = 500000;
		 empSal [4] = 300000;
		 System.out.println("ID      " + " Name   "  + "     Salary   " );
		 display(empId,empName,empSal);
		 System.out.println("================================");
		 System.out.println("ID      " + " Name   ");
		 display(empId,empName);
		 System.out.println("================================");
		 display1(Name ="Clark",empId,empName,empSal);
	}

}
