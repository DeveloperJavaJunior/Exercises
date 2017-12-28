import java.util.Scanner;

public class Zad03BrojSlova {

	/**
	 * Metoda izracunava broj slova u stringu
	 * @param s  string ciji broj slova zelimo izracunati
	 * @return  broj slova u stringu
	 */
	public static int countLetters(String s) {
		// brojac slova
		int count = 0;
		// petlja prolazi cijeli string
		for (int i = 0; i < s.length(); i++) {
			// ako je karakter datog stringa slovo, povecavamo brojac slova za 1
			if (Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		// vracanje rezultata
		return count;
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite neki string: ");
		// uzimanje unosa od korisnika
		String str = input.nextLine();
		// zatvaranje Scannera
		input.close();
		// ispis rezultata koji dobijemo pozivanjem metode za prebrojavanje slova
		System.out.println("Uneseni string ima " + countLetters(str)
				+ " slova.");
	}

}
