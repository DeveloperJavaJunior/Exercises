package Test;

import java.util.Scanner;

public class LinearnaJednacina2x2 {

	public static void main(String[] args) {
		

		// Kreirati skener
		Scanner unos = new Scanner(System.in);
		// Tražiti unos od korisnika
		System.out
				.print("Molimo unesite: a,b,c,d,e,f - ovim redoslijedom i odvojeno razmakom: ");
		// Deklarisanje promjenjivih i dodjeljivanje vrijednosti
		double a = unos.nextDouble();
		double b = unos.nextDouble();
		double c = unos.nextDouble();
		double d = unos.nextDouble();
		double e = unos.nextDouble();
		double f = unos.nextDouble();
		unos.close();

		double x, y; // Nepoznate x i y

		if ((a * d - b * c) != 0) {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("X = " + x + " Y = " + y);
		} else {
			System.out.println("JEDNAÈINA NEMA RJEŠENJA");
		}
	}

}
