import java.util.*;

public class Task3PalindromeInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an integer:");

		int number = input.nextInt();
		input.close();

		if (isPalindrome(number)) {
			System.out.println(number + " is a palindrome ");
		} else {
			System.out.println(number + " is not a palindrome ");
		}
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

	public static boolean isPalindrome(int number) {

		return (number == reverse(number));
	}

}
