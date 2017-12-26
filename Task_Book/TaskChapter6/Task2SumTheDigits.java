import java.util.*;

public class Task2SumTheDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a integer:");

		long n = input.nextLong();
		input.close();

		System.out.println(" The sum is:" + sumDigits(n));

	}

	public static int sumDigits(long n) {

		int sum = 0;

		do {
			sum += n % 10;
		} while ((n = n / 10) != 0);

		return sum;
	}

}
