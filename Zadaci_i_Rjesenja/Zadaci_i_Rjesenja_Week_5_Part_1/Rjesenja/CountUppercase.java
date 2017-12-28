package week5;

//importovati Scanner
import java.util.Scanner;

public class CountUppercase {
	public static void main(String[] args) {

		// varijabla koja će sadržavati broj uppercase karaktera
		int brojacKaraktera = 0;

		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese neki string
		System.out.println("Unesite string: ");

		// dodijeliti korisnikov unos varijabli
		String korisnik = input.nextLine();

		// zatvoriti Scanner
		input.close();

		// proći kroz string i izbrojati uppercase karaktere
		for (int i = 0; i < korisnik.length(); i++) {
			if (Character.isUpperCase(korisnik.charAt(i))) {
				brojacKaraktera++;
			}
		}

		// ispisati korisniku rezultat
		System.out.println("String koji ste unijeli sadrzi " + brojacKaraktera + " uppercase karaktera.");
	}

}
