package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji generiše tri nasumièna cijela jednocifrena broja, pita
 * korisnika koliko iznosi suma ta tri broja i ispisuje da li je rezultat taèan
 * ili ne. 
 * 
 * Sample run programa: 
 * Koliko iznosi 5 + 7 + 1 ? 13 
 * Odgovor je tacan.
 */
public class Zadatak8 {

	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// generisati tri nasumicna jednocifrena broja
		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);
		int number3 = (int) (Math.random() * 10);

		// izracunati sumu nasumicnih brojeva
		int rezultat = number1 + number2 + number3;

		// pitati korisnika da sabere brojeve i unese rezultat
		System.out.println("Koliko iznosi " + number1 + " + " + number2 + " + "
				+ number3 + " ? ");

		// uzeti rezultat od korisnika
		int korisnikovRezultat = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// ako je korisnikov rezultat jednak stvarnom rezultatu ispisati poruku da je odgovor tacan
		if (korisnikovRezultat == rezultat) {
			System.out.println("Odgovor je tacan");
		} else { // ako je korisnikov rezultat nije jednak stvarnom rezultatu ispisati poruku da je odgovor netacan
			System.out.println("Odgovor nije tacan, suma iznosi " + rezultat);
		}

	}

}
