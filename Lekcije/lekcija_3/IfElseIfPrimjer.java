package lekcija_3;

import java.util.Scanner;

public class IfElseIfPrimjer {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Molimo vas unesite ostvareni broj bodova: ");
		double bodovi = unos.nextDouble();

		if (bodovi >= 90) {
			System.out.println("Vaša ocjena je 10.");
		} else if (bodovi >= 80 && bodovi < 90) {
			System.out.println("Vaša ocjena je 9.");
		} else if (bodovi >= 70 && bodovi < 80) {
			System.out.println("Vaša ocjena je 8.");
		} else if (bodovi >= 60 && bodovi < 70) {
			System.out.println("Vaša ocjena je 7.");
		} else if (bodovi >= 50 && bodovi < 60) {
			System.out.println("Vaša ocjena je 6.");
		} else {
			System.out.println("Zao nam je , niste polozili ispit.");
		}
		unos.close();
	}

}
