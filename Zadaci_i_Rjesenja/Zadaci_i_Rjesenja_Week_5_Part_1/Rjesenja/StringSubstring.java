package week5;

//importovati Scanner
import java.util.Scanner;

public class StringSubstring {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese dva stringa
		System.out.print("Unesite prvi string: ");
		String string1 = input.nextLine();
		System.out.print("Unesite drugi string: ");
		String string2 = input.nextLine();

		// zatvoriti Scanner
		input.close();

		// provjeriti da li je drugi string substring prvog
		if (string1.contains(string2)) {
			System.out.println("drugi string je substring prvog");
		} else {
			System.out.println("drugi string nije substring prvog");
		}
	}
}
