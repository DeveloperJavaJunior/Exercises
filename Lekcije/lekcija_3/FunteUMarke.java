package lekcija_3;

import java.util.Scanner;

public class FunteUMarke {

	public static void main(String[] args) {

		double funte, marke;

		Scanner unos = new Scanner(System.in);

		System.out.print("Molimo vas unesite iznos u funtama: ");
		funte = unos.nextDouble();

		if (funte < 0) {
			// ukoliko je unos negativan broj ispisati poruku
			System.out.println("Nije moguce izvrsiti konverziju.");
		} else {
			// izvrsiti konverziju
			marke = funte * 2.20;
			// ispisati korisniku rezultat
			System.out.println(funte + " funti je: " + marke + " BAM.");
		}
		unos.close();
	}

}
