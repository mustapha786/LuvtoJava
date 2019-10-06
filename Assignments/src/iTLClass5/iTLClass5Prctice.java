package iTLClass5;

import java.util.ArrayList;
import java.util.Collections;

public class iTLClass5Prctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i = 10;
		Integer Integer1 = new Integer(i);
		System.out.println("Value of Integer is :"+Integer1);
		System.out.println("Value of Integer is :"+ Integer1.toString()); */
		
		/*Integer i = 200;  
		int j = 100;    
		i = j;    
		System.out.println(i + j + 200);  */
		
		ArrayList<String> strings=new ArrayList<String>();
		strings.add("aAaA");
		strings.add("AaA");
		strings.add("aAa");
		strings.add("AAaa");
		Collections.sort(strings);
		for (String s : strings) {
		System.out.print(s + " ");}
		
		
	}

}
