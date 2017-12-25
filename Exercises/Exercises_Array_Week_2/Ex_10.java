package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 23.11.2017
 * @author A
 *
 *         Napisati program pita korisnika da unese duzinu niza, a zatim i
 *         elemente nizakoji su cijeli brojevi.Program treba da izracunai
 *         ispisearitmetièku sredinu onih clanova niza koji su manji od
 *         aritmeticke sredine svih èlanova niza.
 */

public class Ex_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite duzinu niza: ");

		int length = input.nextInt();

		int[] array = new int[length];

		System.out.printf(" Unesite niz od %d brojeva odvojenih spaceom: ",length);

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();

		System.out.printf(" Aritmeticka sredina svih elemenata: %.2f \n",average(array));
		System.out.printf(" Aritmeticka sredina elemenata manjih od aritmeticke sredine svih elemenata iznosi: %.2f ", newAverage(array));
	}

	public static double average(int[] array) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}
		return sum / array.length;

	}

	public static double newAverage(int[] array) {

		int count = 0;
		
		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < average(array)) {
				count++;
				sum += array[i];

			}

		}
		return sum / count;

	}
}
