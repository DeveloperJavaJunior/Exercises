package zadaci;

import java.util.Scanner;

public class Zad3Najveci {
	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);

		int currentNumber = 0; // promjenljiva koja predstavlja trenutno uneseni broj
		int greatest = 0; // promjenljiva koja predstavlja najveci uneseni broj
		int counter = 0; // brojac koliko se puta najveci broj pojavljuje

		do {
			System.out.println("Unesite broj: ");
			currentNumber = input.nextInt(); // unos od korisnika
			
			// ako je uneseni broj veci od trenutno najveceg broja, najveci broj postaje taj uneseni broj
			// a brojac setujemo na 1
			if (currentNumber > greatest) { 
				greatest = currentNumber;
				counter = 1;
			} else if (currentNumber == greatest) { // ako je uneseni broj jednak trenutno najvecem broju, brojac povecavamo za 1
				counter++;
			}

		} while (currentNumber != 0); // petlja se vrti dok korisnik ne unese 0
		
		input.close();
		
		// ispis najveceg broja
		System.out.println("Najveci je: " + greatest);
		// ispis koliko se puta najveci broj ponovio
		System.out.println("Ponovio se " + counter + " puta.");
		

		
	}

}
