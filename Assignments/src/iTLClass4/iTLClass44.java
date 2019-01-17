package iTLClass4;

class Multi extends Thread {
public void run()
{System.out.println("Thread Multi started working  ");
	
//public void evennumbers()
//{
 for ( int i = 1 ; i <=10 ;i++)
 {
	 System.out.println("5 " + "* " + i + "= " + (5*i) );
 }
 

}
}

public class iTLClass44 {
	
	public void Evenumbers()
	{
		int b=2;
		 int i=0;
		 {
		do 
		{

			System.out.println("Eevn Number:" +b);
			 
			b=b+2;
			
			i=i+1;
		}while (i<21);
				}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi Multit = new Multi();
		Multit.start();
	
		iTLClass44 Odd = new iTLClass44();
		Odd.Evenumbers();
		

	}

} 
