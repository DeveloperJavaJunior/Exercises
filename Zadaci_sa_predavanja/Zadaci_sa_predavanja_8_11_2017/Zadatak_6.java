package zadaci_sa_predavanja_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji pita korisnika da unese cijeli broj te ispisuje piramidu
 *  svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh piramide 
 *  je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3 2 1 2 3, red ispod
 *  4 3 2 1 2 3 4 itd.)
 */

public class Zadatak_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj redova piramide: ");

		int row = input.nextInt();
		input.close();
	
		// Vanjska petlja koja ide od 1 do unesenog broja
		for (int i = 1; i <= row; i++) {
			// Petlja za razmake
			for (int j = 1; j <= (row - i); j++) {
				System.out.print("    ");
				//%6s

			}
			// Petja za lijevu stranu piramide
			for (int j = i; j >= 1; j--) {
				System.out.printf(" %2d ",j);
			}
			// Petja za desnu stranu piramide
			for (int j = 2; j <= i; j++) {
				System.out.printf("  %2d ",j);
				
			}
			System.out.println();
		}
	}

}
