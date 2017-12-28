package week5;

//importuj Scanner
import java.util.Scanner;

public class StringNaopako {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese neki string
		System.out.print("Unesite neki string: ");

		// dodijeliti korisnikov unos varijabli
		String korisnik = input.nextLine();

		// zatvoriti Scanner
		input.close();

		// ispisati string naopako
		for (int i = korisnik.length() - 1; i >= 0; i--) {
			System.out.print(korisnik.charAt(i));
		}
	}
}
