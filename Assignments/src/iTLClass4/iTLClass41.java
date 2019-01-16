package iTLClass4;

import java.util.Iterator;
import java.util.LinkedList;

interface Queue {
	 //   void Define_Queue ();
		void Queue_insert ();
		void Queue_delete ();
	}

class Queue_q implements Queue {
	
	public void Queue_insert (LinkedList a1,int x)
	{
		
		a1.add(x);
			
	}
	
	public void Queue_delete (LinkedList a1)
	{
		a1.poll();
		}

	@Override
	public void Queue_insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Queue_delete() {
		// TODO Auto-generated method stub
		
	}
	
}


public class iTLClass41 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList Qarray = new LinkedList() ;
		Queue_q Q1 = new Queue_q();
		Q1.Queue_insert(Qarray,10);
		Q1.Queue_insert(Qarray,20);
		Q1.Queue_insert(Qarray,30);
		Q1.Queue_insert(Qarray,40);
		Q1.Queue_insert(Qarray,50);
		Q1.Queue_insert(Qarray,60);
		Q1.Queue_insert(Qarray,70);
		 
		Iterator itr=Qarray.iterator();  
		System.out.println("Values from Queue:");
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); }
		//int Qlength = Qarray.size();
		
		  System.out.println("Values from Queue after first delete:");
		  Q1.Queue_delete(Qarray);
		  Iterator itr1=Qarray.iterator();  
		  while(itr1.hasNext()){  
			   System.out.println(itr1.next()); }
		  
		  System.out.println("Values from Queue after Second delete:");
		  Q1.Queue_delete(Qarray);
		  Iterator itr2=Qarray.iterator();  
		  while(itr2.hasNext()){  
			   System.out.println(itr2.next()); }
	}

}
