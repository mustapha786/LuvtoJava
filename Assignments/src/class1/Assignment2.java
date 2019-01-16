package class1;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int Card = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter your choice:");
	int x = sc.nextInt();
	Card = x;
	String card_message = null ; 
	
	
	
	switch(Card)
	{
	case 1: 
		card_message = "Hurray I am the best";
		break;
	case 2:
		card_message = "I have a chance to be the best";
		break;
	case 3:
		card_message = "I have to make this happen next time";
		break;
	case 4:
		card_message = "I have to work little hard";
		break;
	case 5:
		card_message = "I have to stop playing much";
		break;
	case 6:
		card_message = "I have to spend more time";
		break;
	case 7:
		card_message = "I have to practice more ";
		break;
	case 8:
		card_message = "I must be serious now";
		break;
	case 9:
		card_message = "Lets try it again working hard ";
		break;
	case 10:
		card_message = "Lets try to understand how to restart";
		break;
	}
	
	System.out.println("Here is message for you: " + card_message );
	 
	}

}
