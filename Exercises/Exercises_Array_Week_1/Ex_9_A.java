package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 20.11.2017
 * @author Edin Korkic
 * 
 *         Napisati metodu koja uzima niz, smješta njegove elemente u novi niz u
 *         obrnutom redoslijedu i potom vraæa obrnuti niz. Metoda treba imati
 *         sledeæi header: public static int[] reverse(int[] array). Napisati
 *         test program koji kaže korisniku da unese niz od 10 brojeva, a zatim
 *         ispisuje taj niz u obrnutom redoslijedu pozivajuæi reverse metodu.
 */

public class Ex_9_A {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		System.out.printf(" Obrnuti niz: ");

		reverse(array);
	}

	public static int[] reverse(int[] array) {

		for (int j = array.length - 1; j >= 0; j--) {
			System.out.printf(" %d ", array[j]);

		}

		return array;
	}
}