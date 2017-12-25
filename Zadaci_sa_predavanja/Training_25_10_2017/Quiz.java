package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 *  
 * 	Napisati program koji pita korisnika da unese rezultat zbira 2 nasumièno generisana,
 * 	jednocifrena broja. Program treba da pita korisnika pitanje tipa “Koliko je 3 + 4?”
 * 	gdje su 3 i 4 nasumièno generisani brojevi.Nakon što korisnik unese odgovor, program 
 * 	provjerava da li je uneseni odgovor taèan. Ukoliko je korisnik unio taèan odgovor, 
 *  program ispisuje „Odgovor koji ste unijeli je taèan. Svaka èast!“. Ukoliko korisnik 
 *  nije unio taèan odgovor, program ispisuje „Odgovor koji ste unijeli nije taèan. 
 *  taèan odgovor je ODGOVOR“
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
			System.out.printf(" Vaš odgovor je taèan.");
		} else {
			System.out.printf(" Vaš odgovor je nije taèan.Taèan odgovor je %d ", sum);
		}

	}

}
