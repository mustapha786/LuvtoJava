package class1;
import java.util.Random;
public class Assignment1 {

	
	public Assignment1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random Micheal = new Random();
		Random Bruce = new Random();
		int m = Micheal.nextInt(50) + 1;
		int b = Bruce.nextInt(50) + 1;
		
		System.out.println("Here is your Number Micheal : " + m);
		System.out.println("Here is your Number Bruce : " + b);

		if (m<b)
		{
			System.out.println("Some thing better waiting for you Micheal!! Wish you all the best ");
		}
		else
		{
			System.out.println("Some thing better waiting for you Bruce!! Wish you all the best ");
		};
	}

}
