package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Napisati program koji ispisuje sve prestupne godine, 10 po liniji, u
 *         rasponu godina koje korisnik unese.
 * 
 *         Program pita korisnika da unese poèetnu godinu, krajnju godinu te
 *         ispisuje sve godine u tom rasponu. Razmak izmeðu godina treba biti
 *         jedan space.
 * 
 * 
 */

public class PrintLeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite pocetnu i krajnju godinu: ");

		int initialYear = input.nextInt();

		int lastYear = input.nextInt();

		input.close();

		int numberLeapYears = 0;

		for (int i = initialYear; i <= lastYear; i++) {

			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {

				System.out.print(i + " ");

				numberLeapYears++;

				if (numberLeapYears % 10 == 0) {

					System.out.println();

				}
			}

		}
	}

}
