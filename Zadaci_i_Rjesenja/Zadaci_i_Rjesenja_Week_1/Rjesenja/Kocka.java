

/*
 * Napisati program koji uzima od korisnika duzinu ivice kocke i na osnovu nje racuna obim i povrsinu kocke.
 * Obim kocke se racuna po formuli: O = 12a. Površina se izraèunava po formuli: P = 6a^2.
 * Sample run programa:
 * Unesite duzinu ivice kocke u cm: 7.5
 * Obim kocke cija je ivica 7.5 cm iznosi: 90.0 cm
 * Povrsina kocke cija je ivica 7.5 cm iznosi: 337.5 cm^2
 */

// importovati skener
import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese duzinu ivice kocke
		System.out.print("Unesite duzinu ivice kocke u cm: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double duzinaIvice = unos.nextDouble();
		
		// zatvoriti skener
		unos.close();
		
		// izracunavanje obima kocke
		double obim = 12 * duzinaIvice;
		
		// izracunavanje povrsine kocke
		double povrsina = 6 * duzinaIvice * duzinaIvice;
		
		// ispis obima
		System.out.println("Obim kocke cija je ivica " + duzinaIvice +" cm iznosi: " + obim + " cm.");
		
		// ispis povrsine
		System.out.println("Povrsina kocke cija je ivica " + duzinaIvice +" cm iznosi: " + povrsina + " cm^2.");
	}

}
