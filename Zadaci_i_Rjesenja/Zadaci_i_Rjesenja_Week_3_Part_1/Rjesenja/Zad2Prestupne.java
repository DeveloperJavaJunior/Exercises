package zadaci;

import java.util.Scanner;

public class Zad2Prestupne {
	
	public static void main(String[] args) {
		
		// novi Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite pocetnu godinu: ");
		int startYear = input.nextInt(); // unos pocetne godine od korisnika
		
		System.out.println("Unesite krajnju godinu:");
		int endYear = input.nextInt(); // unos krajnje godine od korisnika
		
		int numberOfLeapYears = 0; // brojac prestupnih godina
		
		input.close();
		
		// petlja prolazi sve godine od pocetne do krajnje
		for(int i = startYear; i <= endYear; i++) {
			// ako je godina prestupna, povecavamo broj prestupnih godina
			if(i % 4 == 0 && (i % 100 != 0 || i % 400 == 0)) {
				numberOfLeapYears++;
				// ako je broj prestupnih godina djeljiv sa 10, ispisujemo godinu u novom redu
				if(numberOfLeapYears % 10 == 0) {
					System.out.println(i);
				} else { // ako nije vec ispisano 10 prestupnih godina, ispisujemo godinu u liniji sa razmakom
					System.out.print(i + " ");
				}
			}
		}
		
		
	}

}
