package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese trocifren cijeli broj i
 * ispituje da li je taj broj palindrom. 
 * Broj je palindrom ako je isti èitajuæi s lijeva na desno i s desna na lijevo. 
 * Sample run programa: 
 * Unesite trocifren cijeli broj: 121 
 * Broj 121 je palindrom. 
 * 
 * Unesite trocifren cijeli broj: 123
 * Broj 123 nije palindrom.
 */
public class Zadatak1 {
	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese trocifren broj
		System.out.print("Unesite trocifren cijeli broj: ");

		// uzeti unos od korisnika
		int broj = unos.nextInt();

		// zatvaranje Scannera
		unos.close();

		// dobijanje prve cifre broja
		int prvaCifra = broj / 100;

		// dobijanje posljednje cifre broja
		int trecaCifra = broj % 10;

		// poredjenje prve i posljednje cifre, ako su jednake broj je palindrom
		if (prvaCifra == trecaCifra) {
			System.out.println("Broj " + broj + " je palindrom.");
		} else {
			System.out.println("Broj " + broj + " nije palindrom.");
		}
	}
}
