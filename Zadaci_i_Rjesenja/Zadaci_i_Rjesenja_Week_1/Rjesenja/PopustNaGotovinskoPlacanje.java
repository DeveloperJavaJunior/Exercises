/**
Napisati program koji računa iznos popusta na gotovinsko plaćanje robe i cijenu robe sa popustom.
Korisnik treba da unese vrijednost robe u KM i popust u procentima. 

Sample run programa:

Unesite vrijednost robe u KM: 175.50
Unesite popust na gotovinsko placanje u procentima: 12
Vrijednost popusta je: 21.06 KM
Vrijednost robe sa popustom je: 154.44 KM
 */
package week1;

import java.util.Scanner;

public class PopustNaGotovinskoPlacanje {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese vrijednost robe
		System.out.print("Unesite vrijednost robe u KM: ");

		// uzeti unos od korisnika i spremiti ga u varijablu
		double vrijednostRobe = unos.nextDouble();

		// pitati korisnika da unese popust
		System.out.print("Unesite popust na gotovinsko placanje u procentima: ");

		// uzeti unos od korisnika i spremiti ga u varijablu
		double popust = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati popust
		double iznosPopusta = (vrijednostRobe * popust) / 100;

		// ispisati korisniku rezultate
		System.out.println("Vrijednost popusta je: " + iznosPopusta + " KM.");
		System.out.println("Vrijednost robe sa popustom je: " + (vrijednostRobe - iznosPopusta) + " KM.");
	}
}
