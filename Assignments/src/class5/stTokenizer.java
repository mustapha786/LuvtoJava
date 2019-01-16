package class5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		int y=0;
		int z=0;
		String input = null;
		System.out.println("Please eneter 2 numbers to do arithmatic operations, with coma seperated");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		try {
			 input = buff.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		StringTokenizer tokenizer = new StringTokenizer(input,",");
		x = Integer.parseInt(tokenizer.nextToken());
		y = Integer.parseInt(tokenizer.nextToken());
	//	z = Integer.parseInt(tokenizer.nextToken());
		System.out.println("First input Value :" + x);
		System.out.println("Second input Value :" + y);
	//	System.out.println("Third input Value :" + z);

	}

}
