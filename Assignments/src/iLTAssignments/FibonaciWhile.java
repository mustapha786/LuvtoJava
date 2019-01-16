package iLTAssignments;

public class FibonaciWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=0;
		 int n1=1;
		 int n2=0;
		 int i2=1;
		 int array[] = new int [10];
		 int i=0;
		 while (i<=8)
		 {
			 if (n==0)
			 {
//				 System.out.println("Fibonaci Series is :"+ n1);
				 array[0] = n1;
			 }
			 n2 = n + n1;
			 
//			 System.out.println("Fibonaci Series is :"+ n2);
			 array[i2] = n2;
			n=n1;
			n1=n2;
			i2++;
			i++;
			
		 }

		 System.out.println("First 10 numbers from Fibonaci Series are :");
		 for (int m:array)
		 {
			 System.out.println(m);
		 }

	}

}
