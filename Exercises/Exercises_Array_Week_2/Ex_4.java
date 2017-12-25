package exercises_Array_Week_2;

/**
 * 21.11.2017
 * 
 * @author A
 *
 *         Napisati metodu sa sledecim headerom:public static int[]
 *         generateArray()koja generise niz od 10 nasumicnih,cijelih brojeva s
 *         tim da se vrijednosti elemenata niza ne smijuponavljati. Napisati
 *         testni program koji ispisuje niz generisan generateArray() metodom.
 */

public class Ex_4 {

	public static void main(String[] args) {

		int[] array = generateArray();

		for (int n : array) {
			System.out.printf(" %d ", n);
		}

	}

	public static int[] generateArray() {

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			int e = (int) (Math.random() * 100);
			for (int j = 0; j < array.length; j++) {
				if (e == array[j]) {
					j = -1;
					e = (int) (Math.random() * 100);

				}
			}
			array[i] = e;
		}
		return array;
	}
}
