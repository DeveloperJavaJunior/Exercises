package exercises_Array_Week_2;

/**
 * 23.11.2017
 * 
 * @author A
 *
 *         Napisati program generiseniz sa 20 nasumicnih, cijelih brojeva u
 *         opsegu od 0 do 999, a zatim kreirai ispisuje tri nova niza. Prvi
 *         sadrži jednocifrene, druge dvocifreneitreæi trocifrene generisane
 *         brojeve
 */

public class Ex_7 {

	public static void main(String[] args) {

		int[] array = new int[20];

		System.out.printf(" Nasumicno generasani niz:\n");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
			System.out.printf(" %d ", array[i]);
		}

		System.out.printf("\n Novi niz od jednocifrenih brojeva: ");
		
		printArrayOneDigit(array);

		System.out.printf("\n Novi niz od dvocifrenih brojeva: ");
		
		printArrayTwoDigit(array);
		
		System.out.printf("\n Novi niz od trocifrenih brojeva: ");
		
		printArrayThreeDigit(array);
	}

	public static void printArrayOneDigit(int[] array) {

		for (int n : array) {
			if (n < 10) {
				System.out.printf(" %d ", n);

			}
		}
	}
		public static void printArrayTwoDigit(int[] array) {
			
			for (int n : array) {
				if (n >= 10 && n < 100) {
					System.out.printf(" %d ", n);
					
				}
			}
		}
			public static void printArrayThreeDigit(int[] array) {
				
				for (int n : array) {
					if (n >= 100) {
						System.out.printf(" %d ", n);
						
					}
				}
	}
}
	