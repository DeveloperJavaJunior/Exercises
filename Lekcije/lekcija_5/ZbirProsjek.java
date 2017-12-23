package lekcija_5;

import java.util.Scanner;

public class ZbirProsjek {

	public static void main(String[] args) {

		double korisnikovUnos = -1; // bilo koji broj osim 0
		double suma = 0;
		double prosjek = 0;
		int brojac = 0;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj(0 prekida unos): ");

		while (korisnikovUnos != 0) {
			korisnikovUnos = unos.nextDouble();

			// dodati unijeti broj na varijablu suma
			suma += korisnikovUnos;

			// pevecati brojac
			if (korisnikovUnos != 0) {
				brojac++;
			}
		}
		// izracunati prosjek svih unesenih brojeva
		prosjek = suma / brojac;

		// ispisati korisniku rezultate
		System.out.println("\nUkupno unesenih brojeva: " + brojac);
		System.out.println("Suma svih unijetih brojeva je: " + suma);
		System.out.println("Prosjek svih unijetih brojeva je: " + prosjek);

		// zatvoriti Scanner
		unos.close();

	}

}
