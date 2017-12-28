package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji pita korisnika da unese tri cijela broja, 
 * a zatim ih ispisuje u rastuæem redoslijedu. 
 * Sample run programa: 
 * Unesite tri cijela broja: 4 1 3 
 * Brojevi u rastucem redoslijedu: 1 3 4
 */
public class Zadatak3 {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// reci korisniku da unese tri cijela broja
		System.out.println("Unesite tri cijela broja:");

		// uzeti korisnikove unose i dodati ih varijablama
		int prviBroj = unos.nextInt();
		int drugiBroj = unos.nextInt();
		int treciBroj = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// privremena varijabla koja se koristi pri zamjeni vrijednosti
		// varijabli
		int privremena = 0;

		// ako je prvi broj veci od drugog, mijenjamo im vrijednosti
		if (prviBroj > drugiBroj) {
			privremena = prviBroj;
			prviBroj = drugiBroj;
			drugiBroj = privremena;
		}

		// ako je prvi broj veci od treceg, mijenjamo im vrijednosti
		if (prviBroj > treciBroj) {
			privremena = prviBroj;
			prviBroj = treciBroj;
			treciBroj = privremena;
		}

		// ako je drugi broj veci od treceg, mijenjamo im vrijednosti
		if (drugiBroj > treciBroj) {
			privremena = drugiBroj;
			drugiBroj = treciBroj;
			treciBroj = privremena;
		}

		// ispisati brojeve u rastucem redoslijedu
		System.out.println("Brojevi u rastucem redoslijedu: " + prviBroj + " "
				+ drugiBroj + " " + treciBroj);

	}
}
