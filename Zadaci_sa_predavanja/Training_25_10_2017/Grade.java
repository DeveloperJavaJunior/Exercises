package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese broj bodova(od 0 do 100) koje je dobio na testu.
 *  Na osnovu broja bodova koje korisnik unese ,program ispisuje  ocjenu koju je korisnik zaslužio.
 *  90 - 100 = ocjena 10, 80 - 89 = ocjena 9, 70 - 79 ocjena 8, 60 - 69 = ocjena 7,
 *  50 - 59 = ocjena 6, 0 - 49 = korisnik nije položio ispit.
 *
 * 
 */

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print(" Unesite broj bodova:");

		int bodovi = unos.nextInt();

		unos.close();

		if (bodovi >= 90) {
			System.out.println(" Vaša ocjena je 10.");
		} else if (bodovi >= 80) {
			System.out.println(" Vaša ocjena je 9.");
		} else if (bodovi >= 70) {
			System.out.println(" Vaša ocjena je 8.");
		} else if (bodovi >= 60) {
			System.out.println(" Vaša ocjena je 7.");
		} else if (bodovi >= 50) {
			System.out.println(" Vaša ocjena je 6.");
		} else {
			System.out.println(" Niste polpžili ispit.");
		}

	}

}
