package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 20.11.2017
 * 
 * Napisati program koji sortira niz u opadajuæem redoslijedu (od najveæeg do
 * najmanjeg elementa) koristeæi bubble sort algoritam.
 */

public class Ex_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		input.close();

		System.out.printf(" Niz koji ste unijeli je:");
		for (int i = 0; i < array.length; i++) {
			System.out.printf(" %d ", array[i]);

		}
		System.out.printf("\n");

		System.out.printf(" Niz nakon bubble sorta: ");
		
		bubbleSort(array);

	}

	public static void bubbleSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.printf(" %d ", array[i]);

		}

	}
}
