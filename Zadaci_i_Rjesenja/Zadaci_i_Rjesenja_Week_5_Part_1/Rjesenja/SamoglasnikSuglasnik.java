package week5;

// importuj Scanner
import java.util.Scanner;

public class SamoglasnikSuglasnik {
	public static void main(String[] args) {

		// kreirati novi Scanner
		Scanner input = new Scanner(System.in);

		// pitati korisnika da unese slovo
		System.out.print("Unesite neko slovo: ");

		// pokupi unos od korisnika i dodijeli varijabli
		char slovo = input.next().charAt(0);

		// pretvori karakter u veliko slovo
		if (Character.isLowerCase(slovo)) {
			slovo = Character.toUpperCase(slovo);
		}

		// zatvori Scanner
		input.close();

		// ispisi korisniku poruku
		switch (slovo) {

		default:
			System.out.println("Slovo " + slovo + " nije samoglasnik.");
			break;
		case 'A':
			System.out.println("Slovo A je samoglasnik.");
			break;
		case 'E':
			System.out.println("Slovo E je samoglasnik.");
			break;
		case 'I':
			System.out.println("Slovo I je samoglasnik.");
			break;
		case 'U':
			System.out.println("Slovo U je samoglasnik.");
			break;
		case 'O':
			System.out.println("Slovo O je samoglasnik.");
			break;

		}
	}
}
