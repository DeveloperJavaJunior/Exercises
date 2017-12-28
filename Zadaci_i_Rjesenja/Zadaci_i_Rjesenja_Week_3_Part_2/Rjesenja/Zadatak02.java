package week03_2;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj = 0;
		double suma = 0;
		int brojPozitivnih = 0;
		int brojNegativnih = 0;

		System.out.println("Unesite cijele brojeve (unos prekida 0): ");
		do {
			broj = unos.nextInt();
			if (broj > 0) {
				brojPozitivnih++;
			} else if (broj < 0) {
				brojNegativnih++;
			}

			suma += broj;
		} while (broj != 0);

		double prosjek = suma / (brojPozitivnih + brojNegativnih);
		System.out.println("Broj pozitivnih brojeva: " + brojPozitivnih);
		System.out.println("Broj negativnih brojeva: " + brojNegativnih);
		System.out.println("Suma: " + suma);
		System.out.println("Prosjek: " + prosjek);
		
		unos.close();

	}

}
