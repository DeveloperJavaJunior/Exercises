package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 20.11.2017
 * @author Edin Korkic
 *
 *         Napisati metodu koja pronalazi indeks najmanjeg elementa u nizu
 *         cjelobrojnih vrijednosti, sa sledeæim header-om: public static int
 *         indexOfSmallestElement(int[] array). Napisati test program koji kaže
 *         korisniku da unese 10 cijelih brojeva, poziva ovu metodu i ispisuje
 *         indeks najmanjeg elementa u nizu.
 */
public class Ex_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();
		
		System.out.printf(" Najmanji element u nizu nalazi se na indexu [%d] ",indexOfSmallestElement(array));

	}
 
	public static int indexOfSmallestElement(int[] array) {

		int min = array[0];
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				minIndex = i;
			}
		}

		return minIndex;

	}
}
