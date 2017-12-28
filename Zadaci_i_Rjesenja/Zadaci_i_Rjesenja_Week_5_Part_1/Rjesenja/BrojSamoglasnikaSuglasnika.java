package week5;

// importuj Scanner
import java.util.Scanner;

public class BrojSamoglasnikaSuglasnika {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese string
		System.out.print("Unesite string: ");

		// dodijeli korisnikov string varijabli
		String korisnik = input.nextLine();

		// zatvori Scanner
		input.close();

		// ukloniti spaceove iz korisnikovog stringa
		korisnik = korisnik.replace(" ", "");

		// pretvoriti string u lowercase
		korisnik = korisnik.toLowerCase();

		// ukloniti sve samoglasnike iz korisnikovog stringa
		String korisnikBezSamoglasnika = korisnik.replaceAll("a|e|i|o|u|", "");

		// ispisati korisniku rezultate
		System.out.println("String koji ste unijeli sadrzi " + (korisnik.length() - korisnikBezSamoglasnika.length())
				+ " samoglasnika a " + korisnikBezSamoglasnika.length() + " suglasnika.");
	}
}
