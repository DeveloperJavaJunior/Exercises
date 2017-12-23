package lekcija_3;

import java.util.Scanner;

public class IfElsePrimjer {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);

		System.out.print("Molimo vas unisite jedan cijeli broj: ");
		int broj = unos.nextInt();

		// provjeriti da li je broj paran
		if (broj % 2 == 0) {
			// ova poruka ce biti ispisana samo u slucaju da je uvjet ispunjen
			System.out.println("Broj " + broj + " je paran broj.");
		} else {
			// ova poruka ce biti ispisana samo u slucaju da gornji uvjet nije
			// ispunjen
			System.out.println("Broj " + broj + " nije paran broj.");

		}

		// zatvoriti Scanner
		unos.close();
	}

}
