package week03_2;

import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi prvi broj: ");
		int prviBroj = unos.nextInt();
		System.out.print("Unesi drugi broj: ");
		int drugiBroj = unos.nextInt();

		int max = (prviBroj > drugiBroj ? prviBroj : drugiBroj);
		int i = max;

		while (true) {
			if (i % prviBroj == 0 && i % drugiBroj == 0) {
				System.out.println("Najmanji zajednicki sadrzalac: " + i);
				break;
			}
			i += max;
		}

		unos.close();
	}

}
