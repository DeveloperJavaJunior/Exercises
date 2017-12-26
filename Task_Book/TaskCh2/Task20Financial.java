import java.util.*;

public class Task20Financial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter balance and interest rate:");
		
		double balance = input.nextDouble();
		double annual = input.nextDouble();
		
		input.close();
		double interest = balance * (annual / 1200);

		System.out.print(" The interest is " + interest);
	}

}
