package lekcija_3;

// importovati Scanner
import java.util.Scanner;

public class GBP2BAM {

	public static void main(String[] args) {

		// deklarisati varijabli
		double funte, marke;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese iznos
		System.out.print("Molimo vas unesite iznos u funtama: ");
		funte = unos.nextDouble();

		// izvrsiti konverziju
		marke = funte * 2.20;

		// ispisati korisniku rezultat
		System.out.println(funte + " funti je: " + marke + " BAM.");

		// zatvoriti Scanner
		unos.close();
	}

}
