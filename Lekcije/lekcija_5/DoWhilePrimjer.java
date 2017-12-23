package lekcija_5;

import java.util.Scanner;

public class DoWhilePrimjer {

	public static void main(String[] args) {

		int broj;
		int suma = 0;

		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite cijeli broj(0 prekida unos): ");

		// nastaviti sa ucitavanjem brojeva dok korisnik ne unese 0
		do {
			broj = unos.nextInt();

			suma += broj;
		} while (broj != 0);

		System.out.println("\nSuma svih unesenih brojeva je: " + suma);

		unos.close();

	}

}
