package training_23_10_2017;

import java.util.Scanner;

public class KonvercijaStopa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj stopa koji želite konvertovati:");
		double stope = input.nextDouble();

		input.close();

		double metri = stope * 0.305;

		System.out.printf(" %.2f stope su %.2f metra.", stope, metri);

	}

}
