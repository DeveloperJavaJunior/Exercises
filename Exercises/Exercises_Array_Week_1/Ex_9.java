package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 21.11.2017
 * 
 * @author Edin Korkic
 * 
 *         Napisati metodu koja uzima niz, smješta njegove elemente u novi niz u
 *         obrnutom redoslijedu i potom vraæa obrnuti niz. Metoda treba imati
 *         sledeæi header: public static int[] reverse(int[] array). Napisati
 *         test program koji kaže korisniku da unese niz od 10 brojeva, a zatim
 *         ispisuje taj niz u obrnutom redoslijedu pozivajuæi reverse metodu.
 */

public class Ex_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		int[] reverse = reverse(array);

		System.out.printf(" Obrnuti niz: ");

		for(int n : reverse){
			System.out.printf(" %d ",n);
		}
	}

	public static int[] reverse(int[] array) {

		int[] reverse = new int[array.length];

		for (int i = array.length - 1, j = 0; i >= 0 && j < array.length; i--, j++) {
			reverse[j] = array[i];
		}
		return reverse;

	}

}
