package training_6_11_2017;

import java.util.Scanner;

public class Zadatak_2_drugi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite niz brojrva (0 zaustavlja unos): ");

		int countPos = 0;
		int countNeg = 0;
		double sum = 0;

		for (int num; (num = input.nextInt()) != 0;) {

			if (num > 0) {
				countPos++;
			} else {
				countNeg++;
			}
			sum = countPos + countNeg;
			double avg = sum / (countPos + countNeg);

			System.out.format(" Unijeli ste pozitivnih %d brojeva\n ", countPos);
			System.out.format(" Unijeli ste negativnih %d brojeva\n ", countNeg);
			System.out.format(" Suma brojeva je %f\n ", sum);
			System.out.format(" Prosjek unesenih brojeva %f\n", avg);

		}

	}

}
