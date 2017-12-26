import java.util.*;

public class Task4DisplayReversed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an number:");

		int number = input.nextInt();
		input.close();

		System.out.println(" The reverse number is " + reverse(number));
	}

	public static int reverse(int number) {
		int reverse = 0;
		int digit;

		do {
			digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		} while (number != 0);

		return reverse;
	}

}
