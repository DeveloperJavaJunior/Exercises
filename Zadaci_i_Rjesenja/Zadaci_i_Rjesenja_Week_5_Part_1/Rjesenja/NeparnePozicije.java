package zadaci;

//importovati Scanner
import java.util.Scanner;

public class NeparnePozicije {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese neki string
		System.out.println("Unesite string:");

		// pokupiti unos od korisnika i dodijeliti ga varijabli
		String korisnik = input.nextLine();

		// zatvoriti Scanner
		input.close();

		// ispisati karaktere na neparnim pozicijama
		for (int i = 0; i < korisnik.length() ; i += 2) {
			System.out.print(korisnik.charAt(i));
		}
	}
}
