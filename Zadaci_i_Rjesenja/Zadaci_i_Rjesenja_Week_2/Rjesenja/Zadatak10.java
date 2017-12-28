package zadaci;

import java.util.Scanner;
/**
 * Napisati program koji uèitava od korisnika tri ocjene(iz tri predmeta) i ispisuje prosjek ocjena. 
 * Ukoliko je jedna od ocjena 1 onda je prosjek 1 tj. ako je pao iz jednog predmeta onda se ne raèuna prosjek ocjena.
 * Sample run programa:
 * Unesite tri ocjene: 2 3 5
 * Prosjek ocjena iznosi: 3.3333333333333335
 */
public class Zadatak10 {
	public static void main(String[] args) {
		
		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// reci korisniku da ispise tri ocjene
		System.out.print("Unesite tri ocijene: ");
		
		// uzeti unos ocjena od korisnika
		int ocjena1 = input.nextInt();
		int ocjena2 = input.nextInt();
		int ocjena3 = input.nextInt();
		
		// zatvoriti Scanner
		input.close();
		
		// deklarisati promjenljivu prosjek
		double prosjek = 0;

		// ako je bilo koja od ocjena 1, prosjek je 1
		if (ocjena1 == 1 || ocjena2 == 1 || ocjena3 == 1) {
			prosjek = 1;
		} else { // ako nijedna ocjena nije 1, izracunati prosjek
			// racunanje prosjeka
			prosjek = (ocjena1 + ocjena2 + ocjena3) / 3.0;
		}

		// ispis rezultata
		System.out.println("Prosijek ocijena iznosi: " + prosjek);

	}
}
