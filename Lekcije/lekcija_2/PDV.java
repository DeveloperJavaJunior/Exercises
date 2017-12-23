package lekcija_2;

//importovati Scanner
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// deklarisati varijable
		double orginalniIznos;
		double vrijednostPDVa;
		double konacniIznos;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese pocetni iznos
		System.out.print("Unesite vrijednost za koju zelite izracunati PDV: ");

		// dodijeliti korisnikov unos varijabli
		orginalniIznos = unos.nextDouble();

		// izracunati vrijednostPDVa
		vrijednostPDVa = orginalniIznos * 0.17;

		// izracunati konacan iznos
		konacniIznos = orginalniIznos + vrijednostPDVa;

		// ispisi rezultat korisniku
		System.out.println("vrijednost PDVa je " + vrijednostPDVa);
		System.out.println("Konacan iznos je " + konacniIznos);
		
		// zatvoriti Scanner
		unos.close();

	}
}