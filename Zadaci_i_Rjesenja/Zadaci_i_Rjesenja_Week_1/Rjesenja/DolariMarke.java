/**
Napisati program koji konvertuje američke dolare u konvertibilne marke. Korisnik treba da unese iznos u dolarima, program ga treba konvertovati u KM i ispisati rezultat. 
1 USD = 1.77 KM.

Sample run programa:

Unesite iznos u dolarima: 125
125 dolara iznosi 221.25 KM
 */
package week1;

// importovati Scanner
import java.util.Scanner;

public class DolariMarke {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese iznos u dolarima
		System.out.print("Unesite iznos u dolarima: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double dolari = unos.nextDouble();
		
		// zatvoriti Scanner
		unos.close();
		
		// konvertovati dolare u marke
		double marke = dolari * 1.77;
		
		// ispisati korisniku rezultat
		System.out.println(dolari + " dolara iznosi " + marke + " KM.");
	}

}
