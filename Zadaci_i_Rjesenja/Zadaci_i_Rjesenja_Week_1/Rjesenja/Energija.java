/*
 * Napisati program koji izra�unava energiju potrebnu za zagrijavanje vode od po�etne do �eljene temperature. 
 * Program treba da pita korisnika da unese iznos vode u kilogramima,
 * po�etnu temperaturu vode te �eljenu temperaturu vode. 
 * Formula za izra�unavanje potrebne energije je:
 * Q = M * (zeljenaTemperatura - pocetnaTemperatura) * 4184
 * gdje M predstavlja te�inu vode u kilogramima, temperature predstavljamo u celzijusima, a energiju Q u joulima.
 * 
 * Sample run programa:
 * Unesite te�inu vode u kilogramima: 55.5
 * Unesite po�etnu temperaturu: 3.5
 * Unesite �eljenu temperaturu: 10.5
 * Energija potrebno za zagrijavanje vode: 1625484.0 joula
 */

// importovati Scanner
import java.util.Scanner;

public class Energija {

	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese tezinu vode u kilogramima
		System.out.print("Unesite tezinu vode u kilogramima: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double tezina = unos.nextDouble();

		// pitati korisnika da unese pocetnu temperaturu u celzijusima
		System.out.print("Unesite pocetnu temperaturu: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double pocetnaTemperatura = unos.nextDouble();

		// pitati korisnika da unese zeljenu temperaturu
		System.out.print("Unesite zeljenu temperaturu: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		double zeljenaTemperatura = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();
		
		// izracunavanje energije
		double energija = tezina * (zeljenaTemperatura - pocetnaTemperatura) * 4184;
		
		// ispis rezultata
		System.out.println("Energija potrebno za zagrijavanje vode: " + energija + " joula.");
	}

}
