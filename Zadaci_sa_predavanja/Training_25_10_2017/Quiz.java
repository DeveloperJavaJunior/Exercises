package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 *  
 * 	Napisati program koji pita korisnika da unese rezultat zbira 2 nasumi�no generisana,
 * 	jednocifrena broja. Program treba da pita korisnika pitanje tipa �Koliko je 3 + 4?�
 * 	gdje su 3 i 4 nasumi�no generisani brojevi.Nakon �to korisnik unese odgovor, program 
 * 	provjerava da li je uneseni odgovor ta�an. Ukoliko je korisnik unio ta�an odgovor, 
 *  program ispisuje �Odgovor koji ste unijeli je ta�an. Svaka �ast!�. Ukoliko korisnik 
 *  nije unio ta�an odgovor, program ispisuje �Odgovor koji ste unijeli nije ta�an. 
 *  ta�an odgovor je ODGOVOR�
 */

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		int sum = num1 + num2;
		System.out.printf(" %d + %d = ", num1, num2);

		int answer = unos.nextInt();

		unos.close();

		if (sum == answer) {
			System.out.printf(" Va� odgovor je ta�an.");
		} else {
			System.out.printf(" Va� odgovor je nije ta�an.Ta�an odgovor je %d ", sum);
		}

	}

}
