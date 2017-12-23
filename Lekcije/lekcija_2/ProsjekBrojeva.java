package lekcija_2;

//importovati Scanner
import java.util.Scanner;

public class ProsjekBrojeva {

	public static void main(String[] args) {

		// deklarisati varijable
		double broj1, broj2, broj3;
		double prosjek;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese 3 broja
		System.out.print("Unesite tri broja: ");

		// dodijeliti korisnikov unos varijablama
		broj1 = unos.nextDouble();
		broj2 = unos.nextDouble();
		broj3 = unos.nextDouble();

		// izracunati prosjek
		prosjek = ((broj1 + broj2 + broj3) / 3);

		// ispisi rezultat korisniku
		System.out.println(" Prosjek unesenih brojeva je: " + prosjek);

		// zatvoriti Scanner
		unos.close();

	}

}
