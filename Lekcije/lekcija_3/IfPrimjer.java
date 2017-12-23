package lekcija_3;

// importovati Scanner
import java.util.Scanner;

public class IfPrimjer {

	public static void main(String[] args) {

		// napraviti Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj te dodijeliti broj variabli
		System.out.print("Molimo vas unisite jedan cijeli broj: ");
		int broj = unos.nextInt();

		// provjeriti da li je broj djeljiv sa 5
		if (broj % 5 == 0) {
			// ova poruka ce biti ispisana samo u slucaju da je uvjet ispunjen
			System.out.println("Broj " + broj + " je djeljiv sa 5");
		}
		// provjeriti da li je broj paran
		if (broj % 2 == 0) {
			// ova poruka ce biti ispisana samo u slucaju da je uvjet ispunjen
			System.out.println("Broj " + broj + " je paran broj.");
		}
		// zatvoriti Scanner
		unos.close();
	}

}
