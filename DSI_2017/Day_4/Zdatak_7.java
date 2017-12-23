package day_4;

/*
 * Generiti random niz  0d 10 clanova te ispisati novi niz bez brojeva koji se ponavljaju
 */

public class Zdatak_7 {

	public static void main(String[] args) {

		int[] array = new int[10];

		System.out.print(" Random niz:");
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		changeDuplicate(array);
		
	}

	public static int[] sortArray(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}

	public static void changeDuplicate(int[] array) {
		
		sortArray(array);
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[j] != array[i]) {
				j++;
				array[j] = array[i];
			}

		}

		System.out.print(" Niz nakon sto uklonimo duplikate:");
		for (int i = 0; i <= j; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
