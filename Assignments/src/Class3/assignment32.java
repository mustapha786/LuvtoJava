package Class3;
import java.util.Scanner;

public class assignment32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		overloading ob = new overloading ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to multiply integres ? (Y/N) ");
		char Y = sc.next().charAt(0); 
		if (Y=='Y') 
		{
			System.out.println("Please enter Fisrt Integer ");
			int i = sc.nextInt();
			System.out.println("Please enter Second Integer ");
			int j = sc.nextInt();
			int d =ob.fun(i, j);
			System.out.println("Multiplication of 2 integers  " + d);
			
			
		} else {
			System.out.println("Please enter Fisrt Float ");
			float i = sc.nextFloat();
			System.out.println("Please enter Second Float ");
			float j = sc.nextFloat();
			float d = ob.fun(i, j);
			System.out.println("Multiplication of 2 floats  " + d);
		}
		
		
		
		
	}

}
