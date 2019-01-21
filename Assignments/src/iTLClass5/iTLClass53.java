package iTLClass5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iTLClass53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap employee = new HashMap();
		employee.put(101,"John");
		employee.put(102,"Joy");
		employee.put(103,"Jonny");
		employee.put(104,"Jennifer");
		employee.put(105,"Jerom");
		
		Iterator iterator = employee.entrySet().iterator();
		while (iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry) iterator.next(); 
			System.out.println("Key:" + entry.getKey());
			System.out.println("Value:" + entry.getValue());
		}
	}

}
