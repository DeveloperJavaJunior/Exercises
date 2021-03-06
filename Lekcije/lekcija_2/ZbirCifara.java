package lekcija_2;

// importovati Scanner
import java.util.Scanner;

public class ZbirCifara {

	public static void main(String[] args) {

		// deklarisi varijable
		int unosKorisnika;
		int zadnjaCifra;
		int predzadnjaCifra;
		int zbirCifara;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da broj i dodijeliti unos varijabli
		System.out.print("Unesite trocifreni broj: ");
		unosKorisnika = unos.nextInt();

		// izvuci zadnju cifru
		zadnjaCifra = unosKorisnika % 10;
		unosKorisnika = unosKorisnika / 10; // broj postaje 93

		// izvuci predzadnjucifru
		predzadnjaCifra = unosKorisnika % 10;
		unosKorisnika = unosKorisnika / 10; // broj postaje 9

		// izracunati zbir cifara
		zbirCifara = zadnjaCifra + predzadnjaCifra + unosKorisnika;

		// ispisi rezultat
		System.out.println("Zbir cifara broja kojeg ste unijeli je: " + zbirCifara);

		// zatvoriti Scanner
		unos.close();
	}

}
