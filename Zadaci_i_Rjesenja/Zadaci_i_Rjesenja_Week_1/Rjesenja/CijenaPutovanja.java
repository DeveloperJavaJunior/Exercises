/*
 * Napisati program koji pita korisnika da unese daljinu u kilometrima koju želi preæi,
 * potrošnju auta (koliko kilometara može preæi sa litrom goriva), te cijenu litre goriva. 
 * Ispisati konaènu cijenu putovanja.
 */

// importovati skener
import java.util.Scanner;

public class CijenaPutovanja {

	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese duzinu puta
		System.out.print("Unesite duzinu puta u kilometrima: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double duzinaPuta = unos.nextDouble();

		// pitati korisnika da unese potrosnju auta
		System.out.print("Unesite potrosnju auta (koliko kilometara moze preci sa litrom goriva): ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double potrosnja = unos.nextDouble();

		// pitati korisnika da unese cijenu litre goriva
		System.out.print("Unesite cijenu litre goriva u markama: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double cijenaGoriva = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();
		
		// izracunavanje ukupne cijene putovanja
		double cijenaPutovanja = (duzinaPuta / potrosnja) * cijenaGoriva;

		// ispis rezultata
		System.out.println("Ukupna cijena putovanja iznosi: " + cijenaPutovanja);

	}

}
