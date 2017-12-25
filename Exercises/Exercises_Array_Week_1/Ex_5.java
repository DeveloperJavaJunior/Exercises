package exercises_Array_Week_1;

/**
 * 21.11.2017
 * 
 * @author A
 *
 *         Napisati program koji generiše nasumièan niz od 20 cijelih brojeva u
 *         rasponu od 0 do 100, zatim prolazi kroz niz i ispisuje samo elemente
 *         koji su parni brojevi.
 * 
 */

public class Ex_5 {

	public static void main(String[] args) {

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);

		}

		for (int i : array) {
			System.out.printf(" %d ",i);

		}
		System.out.printf(" %n");
		
		for (int n : array) {
			if (n % 2 == 0) {
				System.out.printf(" %d ", n);

			}
		}

	}

}
