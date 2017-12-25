package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 22.11.2017
 * 
 * @author A
 *
 *         Napisati program koji pita korisnika da uneseniz od 10 cijelih
 *         brojeva, a zatim pronalazi i ispisujekoliko ima èlanova koji su manji
 *         od prvog èlana, a koliko èlanova koji su veæi od zadnjeg èlana niza.
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

		System.out.printf(" Manjih clanova od prvog elementa niza: %d \n", smalestElement(array));
		System.out.printf(" Vecih clanova od zadnjeg elementa niza: %d ", largerElement(array));

	}

	public static int smalestElement(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[0] > array[i]) {
				count++;

			}
		}
		return count;
	}

	public static int largerElement(int[] array) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[9] < array[i]) {
				count++;
			}

		}
		return count;
	}
}