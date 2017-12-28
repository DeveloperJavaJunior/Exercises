/**
 Napisati program koji učitava iznos računa koji treba uplatiti kao i procenat tog računa kojeg želimo platiti kao napojnicu te izračunava ukupan račun i napojnicu.

Sample run programa: 

Unesite iznos racuna u KM: 74 
Unesite napojnicu u procentima: 14.5 
Iznos napojnice: 10.73 KM 
Ukupan iznos racuna: 84.73 KM.
 */
package week1;

// importovati Scanner
import java.util.Scanner;

public class RacunanjeNapojnice {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese iznos racuna
		System.out.print("Unesite iznos racuna u KM: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double iznosRacuna = unos.nextDouble();

		// pitati korisnika da unese iznos napojnice
		System.out.print("Unesite napojnicu u procentima: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double napojnicaProcenat = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati iznos napojnica
		double napojnicaIznos = (iznosRacuna * napojnicaProcenat) / 100;

		// ispisati rezultat korisniku
		System.out.println("Iznos napojnice: " + napojnicaIznos + " KM.");
		System.out.println("Ukupan iznos racuna " + (iznosRacuna + napojnicaIznos) + " KM.");

	}

}
