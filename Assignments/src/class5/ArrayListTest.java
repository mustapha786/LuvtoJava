package class5;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListTest {
	

	public static int removef(ArrayList a1, String item)
	    {
		//ArrayList Declartion 
		  String remove_item = item; 
		  int x =  a1.indexOf(remove_item);
		  a1.remove(remove_item);
		  System.out.println("Removed from specific position 3  :");
		  return x;
	    };
	    
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		System.out.println("Initial Size of ArrayList :" + a1.size());
		
//Insertion into ArrayList 
		a1.add("C");
		a1.add("Cat");
		a1.add("D");
		a1.add("Dog");
		a1.add(1);
		a1.add(100);
		a1.add(100);
		a1.add(6,"C1");
		
		
		System.out.println("updated Size of ArrayList :" + a1.size());
		System.out.println("Does it Contains CAt ? :" + a1.contains("CAt"));
	  
// Display all entries from the ArrayList 
		System.out.println("Collection from the ArrayList :" + a1);
		int x = removef(a1,"Cat");
		System.out.println("Get index for an object removed i.e.'Cat' :" + x);
		System.out.println("updated Size of ArrayList :" + a1.size());
		System.out.println("Collection from the ArrayList :" + a1);
		System.out.println("Get a Value from specific position 3  :" + a1.get(3));
		a1.remove(3);
		
		ListIterator listiterator = a1.listIterator();
		while (listiterator.hasNext())
		{
			Object object = listiterator.next();
			System.out.println("Values are :" + object);
			
		}
		
//		System.out.println("Remove an object from 3rd index ? :" + a1.remove(3));
	}

}
