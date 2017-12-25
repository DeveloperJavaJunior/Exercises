package training_10_11_2017;

/*
 *  @author Edin Korkic
 *
 *  Napisati metodu koja, na osnovu prosljeðenog broja bodova, korisniku ispisuje koju je ocjenu dobio. 
 *  ispisiOcjenu(65.9);ispisiOcjenu(brojBodova);
 *  Ispis programa nakon poziva: Vasa ocjena je 7.
 */

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite broj bodova: ");
		double point = input.nextDouble();
		
		input.close();
		
		score(point);
		

	}
	public static void score(double point) {
		
		if (point >= 90 ) {
			System.out.println(" Vaša ocjena je 10.");
		} else if (point >= 80) {
			System.out.println(" Vaša ocjena je 9.");
		} else if (point >= 70) {
			System.out.println(" Vaša ocjena je 8.");
		} else if (point >= 60) {
			System.out.println(" Vaša ocjena je 7.");
		} else if (point >= 50) {
			System.out.println(" Vaša ocjena je 6.");
		} else if(point < 50){
			System.out.println(" Niste polpžili ispit.");
		}
		else {
			System.out.println(" Pogresan unos..!");
		}

	}

}
