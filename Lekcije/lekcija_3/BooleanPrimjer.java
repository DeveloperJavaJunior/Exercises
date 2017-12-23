package lekcija_3;

// importovati Scanner
import java.util.Scanner;

public class BooleanPrimjer {

	public static void main(String[] args) {
		
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj te ga dodijeli varijabli
		System.out.print(" Molimo vas unesite jedan cijeli broj: ");
		int broj = unos.nextInt();
		
		// ispisati poruke korisniku
		System.out.println("Broj " + broj + " je manji od 10? " + (broj < 10));
		System.out.println("Broj " + broj + " je veci od 5? " + (broj > 5));
		
		// zatvoriti Scanner
		unos.close();
	}

}



