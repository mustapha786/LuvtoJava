package class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assn5IO {

	public static void main(String[] args) {
		float x=0;
		float y=0;
		System.out.println("Please eneter 2 numbers to do arithmatic operations");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please eneter First numbers to do arithmatic operations");
		try {
			 x = Float.parseFloat(buff.readLine());
		//	 System.out.println("x =" + x);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Please eneter Secord numbers to do arithmatic operations");
		try {
			y = Float.parseFloat(buff.readLine());
	//		 System.out.println("y =" + y);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		float add = ( x+y);
		float subs = ( x - y);
		float mult = ( x *y);
		double div = ( x/y);
		System.out.println("Addition of " + x + " and " + y + " is :" + add);
		System.out.println("Substraction of " + x + " and " + y + " is :" + subs);
		System.out.println("Multiplication of " + x + " and " + y + " is :" + mult);
		System.out.printf("Division of " + x + " and " + y + " is :" + "%1.4f",div);
		
	//	System.out.println("x =" + x + "y=" + y);
		
	}

}
