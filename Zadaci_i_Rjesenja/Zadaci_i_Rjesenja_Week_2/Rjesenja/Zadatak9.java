package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji poredi cijene dva paketa kafe. 
 * Program pita korisnika da unese težinu i cijenu oba paketa i prikazuje koji paket ima bolju cijenu.
 * Sample run programa: 
 * Unesite tezinu i cijenu prvog paketa: 50 24.49 
 * Unesite tezinu i cijenu drugog paketa: 25 11.49 
 * Bolju cijenu ima drugi paket.
 *
 */
public class Zadatak9 {

	public static void main(String[] args) {
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese tezinu i cijenu prvog paketa
		System.out.print("Unesite tezinu i cijenu prvog paketa: ");

		// uzeti unos od korisnika i dodijeliti varijablama
		double tezinaPrvogPaketa = unos.nextDouble();
		double cijenaPrvogPaket = unos.nextDouble();

		// pitati korisnika da unese tezinu i cijenu drugog paketa
		System.out.print("Unesite tezinu i cijenu drugog paketa: ");

		// uzeti unos od korisnika i dodijeliti varijablama
		double tezinaDrugogPaketa = unos.nextDouble();
		double cijenaDrugogPaket = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati odnos tezine i cijene prvog paketa
		double odnosPrvogPaketa = tezinaPrvogPaketa / cijenaPrvogPaket;
		// izracunati odnos tezine i cijene drugog paketa
		double odnosDrugogPaketa = tezinaDrugogPaketa / cijenaDrugogPaket;

		// uporediti odnose tezina i cijena paketa i ispisati poruku korisniku
		if (odnosPrvogPaketa > odnosDrugogPaketa) {
			System.out.println("Bolju cijenu ima prvi paket.");
		} else if (odnosPrvogPaketa == odnosDrugogPaketa) {
			System.out.println("Cijene su jednake.");
		} else {
			System.out.println("Bolju cijenu ima drugi paket.");
		}
	}

}
