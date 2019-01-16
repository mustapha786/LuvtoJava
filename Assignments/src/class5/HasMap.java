package class5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hasmap = new HashMap();
		hasmap.put(1,"Golam Khan");
		hasmap.put(2,"Hamid Khan");
		hasmap.put(3,"Praveen K");
		hasmap.put(4,"Srikanth Allada");
		Iterator iterator = hasmap.entrySet().iterator();
		
		while (iterator.hasNext())
		{
			Map.Entry entry = (Map.Entry) iterator.next();
			System.out.println("Key Value:" + entry.getKey());
			System.out.println("Map Value:" + entry.getValue());
		}
		
		int [] a =  {1,2,3};
		int [] b =  {1,2,3};
		
		System.out.println(a==b);
		
		
			
	
	}

}
