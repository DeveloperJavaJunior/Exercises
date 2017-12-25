package exercises_Array_Week_2;

/**
 * 23.11.2017
 * 
 * @author A
 *
 *         Napisati program koji generiseniz od 20 nasumicnih,dvocifrenih
 *         brojeva. Formirati novi niz od èlanova koji su veæi od aritmetièke
 *         sredine prvog nizai ispisati ga.
 */

public class Ex_8 {

	public static void main(String[] args) {

		int[] array = new int[20];

		System.out.printf(" Nasumicno generasani niz:\n");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 90 + 10);
			System.out.printf(" %d ", array[i]);
		}
		System.out.printf("\n");

		System.out.printf(" Aritmeticka sredina svih elemenata niza: %.2f \n", average(array));
		System.out.printf(" Novi niz veci od aritmeticke sredine niza: ");
		printArray(array);

	}

	public static double average(int[] array) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

	public static void printArray(int[] array) {

		for (int n : array) {
			if (average(array) < n) {
				System.out.printf(" %d ", n);

			}
		}
	}
}
