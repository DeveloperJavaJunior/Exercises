/**
Napisati program koji konvertuje funte u kilograme. Program traži od korisnika da unese vrijednost u funtama, konvertuje tu vrijednost u kilograme i ispisuje rezultat.
Jedna funta iznosi 0.454 kilograma.

Sample run programa:

Unesite vrijednost u funtama: 55.5
55.5 funti iznosi 25.197 kilograma
 */

package week1;

//importovati Scanner
import java.util.Scanner;

public class FunteKilogrami {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese vrijednost u funtama
		System.out.print("Unesite vrijednost u funtama: ");

		// ueti unos od korisnika i dodijeliti varijabli
		double funte = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();
		
		// pretvoriti funte u kilograma
		double kilogrami = funte * 0.454;

		// ispisati korisniku rezultat
		System.out.println(funte + " funti iznosi " + kilogrami + " kilograma." );

	}
}
