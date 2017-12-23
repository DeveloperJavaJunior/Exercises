package lekcija_4;

import java.util.Scanner;

public class Zadatak3KarakteriStringa {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite string: ");
		String unijetiString = unos.nextLine();
		unos.close();

		System.out.print("Karakteri stringa: ");

		// petlja koja prolazi cijeli string(indexi idu od 0 do duzina stringa -
		// 1)
		for (int i = 0; i < unijetiString.length(); i++) {
			// ispis svakog karaktera stringa
			System.out.print(unijetiString.charAt(i) + " ");
		}
	}

}
