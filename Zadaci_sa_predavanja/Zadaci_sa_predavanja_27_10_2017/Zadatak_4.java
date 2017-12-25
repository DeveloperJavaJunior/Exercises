package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji konvertuje amerièke dolare u konvertibilne marke. Korisnik treba da unese
 *  iznos u dolarima, program ga treba konvertovati u KM i ispisati rezultat. 1 USD = 1.77 KM
 *  Sample run programa:
 *  Unesite iznos u dolarima: 125
 *  125 dolara iznosi 221.25KM 
 *
 */

public class Zadatak_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos u dolarima:");

		double dolari = input.nextDouble();
		input.close();

		double bam = dolari * 1.77;

		System.out.printf(" %.0f dolara iznosi %.2fKM ", dolari, bam);

	}

}
