package iTLClass3;


class base{  
	base() 
	{  System.out.println("In the base class.."); 
	} 
	void test() 
	{  System.out.println("in the test function...");
	 }
	}

	class derived extends base
	{ 
	derived() 
	{     System.out.println("In the derived class..");
	  super.test(); 
	}
	} 

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			 
		  
		    
			derived d1 = new derived();     
	   
		 


	}

}
