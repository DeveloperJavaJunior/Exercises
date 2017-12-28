package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji dozvoljava korisniku da pogadja da li je ishod bacanja
 * novèiæa pismo ili glava. Program nasumièno generise broj 0 ili 1, koji
 * predstavlja pismo ili glavu. Program pita korisnika da pokusa pogoditi ishod
 * bacanja unosenjem nule ili jedinice i ispisuje mu da li je pogrijesio ili je
 * pogodio. 
 * 
 * Sample run programa: 
 * Unesite ishod bacanja novcica (0 - pismo, 1 - glava): 1 
 * Pogrijesili ste, ishod je pismo. 
 * 
 * Unesite ishod bacanja novcica (0 - pismo, 1 - glava): 0 
 * Svaka cast, pogodili ste.
 */
public class Zadatak6 {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// generisati nasumican broj 0 ili 1 koji predstavlja pismo ili glavu
		int ishodBacanja = (int) (Math.random() * 2);

		// pitati korisnika da pokusa pogoditi ishod
		System.out.println("Pogadjajte stranu novcica, 0 - pismo, 1 - glava");

		// uzeti unos od korisnika
		int korisnikovIshod = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// ako je ishod jednak korisnikovom pokusaju, korisnik je pogodio
		if (korisnikovIshod == ishodBacanja) {

			// ispisivanje poruke da je korisnik pogodio
			System.out.println("Svaka cast, pogodili ste!");

		} else { // ako je korisnik pogrijesio ispisati pravi ishod bacanja

			// ispis ishoda bacanja
			if (ishodBacanja == 0) {
				System.out.println("Pogrijesili ste, ishod bacanja je pismo.");
			} else {
				System.out.println("Pogrijesili ste, ishod bacanja je glava.");
			}
		}

	}
}
