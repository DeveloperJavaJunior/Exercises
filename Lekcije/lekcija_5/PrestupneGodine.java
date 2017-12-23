package lekcija_5;

import java.util.Scanner;

public class PrestupneGodine {

	public static void main(String[] args) {

		int pocetnaGodina = 0;
		int krajnjaGodina = 0;
		int brojPrestupnihGodina = 0;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite pocetnu godinu: ");
		pocetnaGodina = unos.nextInt();

		System.out.print("Unesite krajnju godinu: ");
		krajnjaGodina = unos.nextInt();

		unos.close();

		// petlja prolazi sve godine od pocetne do krajnje
		for (int i = pocetnaGodina; i <= krajnjaGodina; i++) {

			// ako je godina prestupna, povecamo broj prestupnih godina
			if (i % 4 == 0 && (i % 100 == 0 || i % 400 == 0)) {
				brojPrestupnihGodina++;

				// ako smo vec ispisali 10 godina, prelazimo u novi red
				if (brojPrestupnihGodina % 10 == 0) {
					System.out.println(i);
					// ukoliko nismo ispisali 10 godina, nastavljamo u istom
					// redu
				} else {
					System.out.println(i + " ");
				}
			}
		}
	}

}
