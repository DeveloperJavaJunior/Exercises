package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji ispisuje sve prijestupne godine, 10 po liniji,
 *  u rasponu godina koje korisnik unese. Program pita korisnika da unese
 *  poèetnu godinu, krajnju godinu te ispisuje sve godine u tom rasponu.
 *  Razmak izmeðu godina treba biti jedan space.
 *  
 */

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite pocetnu i krajnju godinu: ");

		int initialYear = input.nextInt();
		int lastYear = input.nextInt();

		input.close();

		int leapYearPerLine = 0;

		for (int i = initialYear; i <= lastYear; i++) {
			
			if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				
				System.out.print(i + " ");
				
				leapYearPerLine++;
				
				if (leapYearPerLine % 10 == 0) {
					
					System.out.println();

				}
			}
		}

	}

}
