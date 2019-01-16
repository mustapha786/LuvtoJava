package Class2;
import java.util.Scanner;

public class multiplesofN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you need multiplier for:");
		int a= sc.nextInt();
		int r = 1;
		for (int i=1; i<11;i++)
		{
			r = a * i;
			System.out.println(a + "X" + i + "=" + r  );
		};
	}

}
