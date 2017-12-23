package exercises;

import java.util.*;

public class MetodaPozNeg {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite niz brojeva(0 zaustavlja unos):");

		double n;

		for (; (n = in.nextInt()) != 0;)

			System.out.format(" Uneseno je %d pozitivnih brojeva.\n",
					countPos(n));
		System.out.format(" Uneseno je %d negativnih brojeva.\n", countNeg(n));
		System.out.format(" Suma brojeva je %f.\n", sumNumbers(n));
		System.out.format(" Prosjek brojeva je %f.", averageNumbers(n));

		in.close();
	}

	private static int countPos(double n) {

		int countPos = 0;

		if (n > 0)
			countPos++;

		return countPos;
	}

	private static int countNeg(double n) {

		int countNeg = 0;
		if (n < 0)
			countNeg++;

		return countNeg;
	}

	private static double sumNumbers(double n) {

		double sum = 0;
		sum += n;
		return sum;
	}

	public static double averageNumbers(double n) {

		double average = sumNumbers(n) / countPos(n) + countNeg(n);
		return average;

	}
}