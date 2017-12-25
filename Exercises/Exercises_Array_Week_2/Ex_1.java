package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 20.11.2017
 * @author A
 *
 *         Napisati metodu koja pronalazii vracanajveci element u nizu po
 *         apsolutnoj vrijednosti. Metoda treba da ima sledeci header:public
 *         static int max(int[] array)Napisati testni program koji pita
 *         korisnika da unese duzinu niza, a zatim i vrijednosti niza i ispisuje
 *         vrijednost najveceg elementa u nizu pozivajuci max metodu.
 */
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		int[] array = new int[length];

		System.out.print(" Unesite niz brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		System.out.printf(" Najveca vrijednost u nizu je %d ", max(array));
	}

	public static int max(int[] array) {

		int max = array[0];

		for (int n : array) {
			if (n > max) {
				max = n;
			}
		}
		return max;

	}
}
