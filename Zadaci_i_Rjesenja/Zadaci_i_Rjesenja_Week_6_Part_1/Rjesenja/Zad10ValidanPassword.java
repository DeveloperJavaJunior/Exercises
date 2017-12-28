import java.util.Scanner;

public class Zad10ValidanPassword {
	/**
	 * Metoda provjerava da li je proslijedjeni password validan
	 * Pravila da bi password bio validan su sljedeca:
	 * 1. Password mora biti saèinjen od najmanje 8 karaktera.
	 * 2. Password smije da se sastoji samo od slova i brojeva.
	 * 3. Password mora sadržati najmanje 2 broja.
	 * @param password  string koji zelimo provjeriti da li predstavlja validan password
	 * @return  true, ako je password validan, u suprotnom false
	 */
	public static boolean isValid(String password) {
		// ako je duzina passworda razlicita od 8, password nije validan
		if (password.length() != 8) {
			return false;
		}
		int countDigits = 0; // brojac cifara u passwordu
		// petlja prolazi cijeli password
		for (int i = 0; i < password.length(); i++) {
			// trenutni karakter, odnosno karakter na trenutnom indeksu i
			char currentChar = password.charAt(i);
			// ako trenutni karakter nije slovo ili cifra, password nije validan
			if (!Character.isLetterOrDigit(currentChar)) {
				return false;
			}
			// ako je trenutni karakter cifra, povecaj brojac cifara
			if (Character.isDigit(currentChar)) {
				countDigits++;
			}
		}
		// ako password sadrzi bar 2 cifre, validan je
		if (countDigits >= 2) {
			return true;
		} else { // ako ne sadrzi bar 2 cifre, nije validan
			return false;
		}
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite password: ");
		// uzimanje unosa od korisnika
		String pass = input.nextLine();
		// zatvaranje Scannera
		input.close();
		// ako je uneseni password validan, ispis poruke da je validan
		if (isValid(pass)) {
			System.out.println("Password je validan.");
		} else {
			System.out.println("Password nije validan.");
		}
	}

}
