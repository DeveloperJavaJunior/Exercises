package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 22.11.2017
 * 
 * @author A
 *
 *         Napisati program koji pita korisnika da unese 10 cijelih brojeva u
 *         rasponu od 1 do 100, a zatim prebrojava i ispisuje koji broj se
 *         koliko puta ponovio. Npr. ako unesete 2 2 2 3 74 74 3 5 2 3 program
 *         treba da ispise: Broj 2 se pojavljuje 4 puta. Broj 3 se pojavljuje 3
 *         puta. Broj 5 se pojavljuje 1 put. Broj 74 se pojavljuje 2 puta.
 * 
 */
public class Ex_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];
		int[] count = new int[100];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			int n = input.nextInt();
			array[i] = n;
			count[n]++;

		}
		
		input.close();

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0)

				System.out
						.printf("Broj " + i + " se pojavljuje " + count[i] + (count[i] == 1 ? " put.\n" : " puta.\n"));

		}

	}

}
