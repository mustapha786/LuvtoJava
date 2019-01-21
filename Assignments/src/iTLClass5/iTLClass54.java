package iTLClass5;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class iTLClass54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,Integer>  hastable = new Hashtable<String,Integer>();
		hastable.put("Amit",700);
		hastable.put("Aman",800);
		hastable.put("Animesh",450);
		hastable.put("Amar",900);
		hastable.put("Amrish",600);
		
		//System.out.println("Values:" + hastable );
		
		String name = "";
		int number = 0;
		Iterator iterator = hastable.entrySet().iterator();
		while (iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry) iterator.next(); 
			String name1 = (String) entry.getKey();
			int number1 = (int) entry.getValue() ;
			System.out.println("Key:" + name1);
			System.out.println("Value:" + number1);
			if (number1 > number)
			{
				number = number1;
				name = name1;
			}
			
		
		}
		
		System.out.println(name + " : Got max number and total number he got is : "+ number);
	}

}
