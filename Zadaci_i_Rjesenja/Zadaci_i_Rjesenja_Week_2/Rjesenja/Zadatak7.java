package zadaci;

import java.util.Scanner;

/**
 * Napisati program za igranje igre makaze, papir, bunar. (Makaze pobjedjuju
 * papir, bunar pobjedjuje makaze, papir pobjedjuje bunar).
 * Program nasumièno generiše broj 0, 1 ili 2 koji predstavlja makaze, papir i bunar. 
 * Program trazi od korisnika da unese broj 0, 1 ili 2 i prikazuje poruku da li je
 * korisnik pobjedio, da li je korisnik izgubio ili je neriješeno. 
 * 
 * Sample run programa: 
 * Unesite 0 (makaze), 1 (papir) ili 2 (bunar): 0 
 * Izabrali ste makaze. Racunar je izabrao bunar. Racunar je pobijedio. 
 * 
 * Unesite 0 (makaze), 1 (papir) ili 2 (bunar): 1 
 * Izabrali ste papir. Racunar je izabrao papir. Nerijeseno je.
 */
public class Zadatak7 {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// generisanje nasumicnog broja 0, 1 ili 2 koji predstavlja znak
		// racunara
		int racunarovZnak = (int) (Math.random() * 3);

		// reci korisniku da unese svoj znak
		System.out.print("Unesite 0 (makaze), 1 (papir), 2 (bunar): ");

		// uzeti unos od korisnika
		int korisnikovZnak = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// ako su racunar i korisnik odabrali isti znak
		if (racunarovZnak == korisnikovZnak) {
			// ispisati poruku da je nerijeseno zavisno od toga koji su znak
			// izabrali
			switch (racunarovZnak) {
			case 0: // makaze
				System.out
						.println("Izabrali ste makaze. Racunar je izabrao makaze. Nerijeseno");
				break;
			case 1: // papir
				System.out
						.println("Izabrali ste papir. Racunar je izabrao papir. Nerijeseno");
				break;
			case 2: // bunar
				System.out
						.println("Izabrali ste bunar. Racunar je izabrao bunar. Nerijeseno");
				break;
			}
		} else { // ako su izabrali razlicite znakove, provjeriti ko je pobjedio

			// u zavisnosti od korisnikovog znaka i racunarovog znaka, ispitati
			// ko je pobijedio i ispisati poruku
			switch (korisnikovZnak) {
			case 0: // korisnik je izabrao makaze
				if (racunarovZnak == 1) { // ako je racunar izabrao papir,
											// korisnik je izgubio
					// ispis poruke
					System.out
							.println("Izabrali ste makaze. Racunar je izabrao papir. Pobjeda");
				} else if (racunarovZnak == 2) { // ako je izabrao makaze,
													// korisnik pobjedjuje
					// ispis poruke
					System.out
							.println("Izabrali ste makaze. Racunar je izabrao bunar. Racunar je pobjedio");
				}
				break;
			case 1: // korisnik je izabrao papir
				if (racunarovZnak == 0) { // ako je racunar izabrao makaze,
											// korisnik je izgubio
					// ispis poruke
					System.out
							.println("Izabrali ste papir. Racunar je izabrao makaze. Racunar je pobjedio");
				} else if (racunarovZnak == 2) { // ako je racunar izabrao
													// bunar, korisnik je
													// pobjedio
					// ispis poruke
					System.out
							.println("Izabrali ste papir. Racunar je izabrao bunar. Pobjeda");
				}
				break;
			case 2: // korisnik je izabrao bunar
				if (racunarovZnak == 0) { // ako je racunar izabrao makaze,
											// korisnik je pobjedio
					// ispis poruke
					System.out
							.println("Izabrali ste bunar. Racunar je izabrao makaze. Pobjeda");
				} else if (racunarovZnak == 1) { // ako je racunar izabrao
													// papir, korisnik je
													// izgubio
					// ispis poruke
					System.out
							.println("Izabrali ste bunar. Racunar je izabrao papir. Racunar je pobjedio");
				}
				break;
			}
		}
	}
}
