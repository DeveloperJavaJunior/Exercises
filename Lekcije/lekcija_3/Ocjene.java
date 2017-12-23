package lekcija_3;

import java.util.Scanner;

public class Ocjene {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Molimo vas unesite ostvareni broj bodova: ");
		double bodovi = unos.nextDouble();

		if (bodovi >= 90) {
			System.out.println("Vaša ocjena je 10.");
		} 
		if (bodovi >= 80 && bodovi < 90) {
			System.out.println("Vaša ocjena je 9.");
		} else if (bodovi >= 70 && bodovi < 80) {
			System.out.println("Vaša ocjena je 8.");
		} 
		if (bodovi >= 60 && bodovi < 70) {
			System.out.println("Vaša ocjena je 7.");
		} 
		if (bodovi >= 50 && bodovi < 60) {
			System.out.println("Vaša ocjena je 6.");
		}
		if (bodovi < 50) {
		System.out.println("Zao nam je , niste polozili ispit.");
		}
		unos.close();

	}

}
