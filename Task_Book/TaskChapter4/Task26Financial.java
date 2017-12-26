import java.util.*;

public class Task26Financial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double:");
		
		String amount = input.next();
		input.close();

		int numberOfOneDollars = Integer.parseInt(amount.substring(0,
				amount.indexOf('.')));
		int numberOfCents = Integer.parseInt(amount.substring(amount
				.indexOf('.') + 1));

		int numberOfQuarters = numberOfCents / 25;
		numberOfCents = numberOfCents % 25;

		int numberOfDimes = numberOfCents / 10;
		numberOfCents = numberOfCents % 10;

		int numberOfNickels = numberOfCents / 5;
		numberOfCents = numberOfCents % 5;

		int numberOfPennies = numberOfCents;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println("    " + numberOfOneDollars + " dollars");
		System.out.println("    " + numberOfQuarters + " quarters ");
		System.out.println("    " + numberOfDimes + " dimes");
		System.out.println("    " + numberOfNickels + " nickels");
		System.out.println("    " + numberOfPennies + " pennies");

	}

}
