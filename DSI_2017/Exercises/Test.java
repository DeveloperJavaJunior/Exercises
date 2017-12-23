package exercises;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int n = input.nextInt();
		int f = 2; // Numbers to test as factors

		// Find and display all the smallest factors in increasing order
		while (n / f != 1) {
			// Test as a factor of number
			if (n % f == 0) {
				System.out.print(f + ", ");
				n /= f;
			} else
				f++; // Increment index
		}
		System.out.println(n + ".");
	}
}
