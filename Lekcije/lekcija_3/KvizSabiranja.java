package lekcija_3;

//importovati Scanner
import java.util.Scanner;

public class KvizSabiranja {

	public static void main(String[] args) {

		// generisati dva nasumicna, jednocifrena, cijela broja
		int broj1 = (int) (Math.random() * 10);
		int broj2 = (int) (Math.random() * 10);

		// kreirati novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese rezultat sabiranja
		System.out.println("Koliko je " + broj1 + " + " + broj2 + "?: ");
		// dodijeliti korisnikov unos varijabli
		int odgovor = unos.nextInt();

		// provjeriti da li je odgovor tacan, ispisati rezultat korisniku
		if (odgovor == broj1 + broj2) {
			System.out.println("Cestitamo, unijeli ste tacan odgovor:");
		} else {
			System.out.println("Odgovor koji ste unijeli nije tacan. " + "Tacan odgovor je " + (broj1 + broj2));
		}

		// zatvoriti Scanner
		unos.close();
	}

}
