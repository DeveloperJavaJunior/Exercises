import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 */

public class SumEven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj: ");

		int number = input.nextInt();

		input.close();

		int sum = 0;

		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {

				sum += i;

			}
		}

		System.out.printf(" Suma parnih brojeva do broja %d iznosi %d ", number, sum);
	}

}
