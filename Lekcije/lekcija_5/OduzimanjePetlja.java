package lekcija_5;

import java.util.Scanner;

public class OduzimanjePetlja {

	public static void main(String[] args) {
		
		int broj1,broj2,korisnikovUnos,rezultatOduzimanja;
		Scanner unos = new Scanner(System.in);
		
		// nasumicno generisati dva cijela broja
		broj1 = (int) (Math.random() * 10);
		broj2 = (int) (Math.random() * 10);
		
		// ispisati korisniku pitanje i izracunati tacan odgovor
		if(broj1 < broj2){
			System.out.println("koliko je " + broj2 + " - " + broj1 + "?: ");
			rezultatOduzimanja = broj2 - broj1;
		}else{
		System.out.println("koliko je " + broj1 + " - " + broj2 + "?: ");
		rezultatOduzimanja = broj1 - broj2;
		}
		// dodijeliti korisnikov unos varijabli
		korisnikovUnos = unos.nextInt();
		
		// vrti petlju dok korisnik ne unese tacan odgovor
		while(korisnikovUnos != rezultatOduzimanja){
			System.out.println("Odgovor koji ste unijeli nije tacan. Molimo vas pokusajte ponovo ");
			korisnikovUnos = unos.nextInt();
		}
		
		// ispisat poruku nakon sto je korisnik unio tacan odgovor
			System.out.println("Cestitamo, unijeli ste tacan odgovor.");
			unos.close();

	}

}

