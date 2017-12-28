package zadaci;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		// novi Scanner
		Scanner unos = new Scanner(System.in);
		// ispis poruke
		System.out.print("Unesite SSN: ");
		// uzimanje unosa od korisnika
		String ssn = unos.nextLine();
		// promjenljiva koja oznacava da li je ssn validan
		boolean validSsn = true;
		// zatvaranje Scannera
		unos.close();

		// ako je duzina ssn-a razlicita od 11, ssn nije validan
		if (ssn.length() != 11) {
			validSsn = false;
		} else { // ako je duzina jednaka 11, nastavljamo provjeru svih simbola
			// petlja prolazi cijeli ssn
			for (int i = 0; i < ssn.length(); i++) {
				
				// ako karakter na indeksu 3 ili na indeksu 6 nije crtica (-)
				// onda ssn nije validan
				if (i == 3 || i == 6) {

					if (ssn.charAt(i) != '-') {
						validSsn = false;
						break;
					}
				} 
				// ako karakter na ostalim indeksima nije broj
				// ssn nije validan
				else {
					
					if (!Character.isDigit(ssn.charAt(i))) {
						validSsn = false;
						break;
					}
				}

			}
		}

		// ako promjenljiva validSnn ima vrijednost true, onda je ssn validan
		if (validSsn) {
			System.out.println(ssn + " je validan ssn broj.");
		} else {
			System.out.println(ssn + " nije validan ssn broj.");
		}
	}

}
