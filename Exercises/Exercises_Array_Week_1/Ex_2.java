package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 20.11.2017
 * @author A
 * 
 *         Napisati metodu koja pronalazi najmanji element u nizu double
 *         vrijednosti, sa sledeæim header-om: public static double min(double[]
 *         array). Napisati test program koji kaže korisniku da unese 10 double
 *         vrijednosti, poziva ovu metodu i ispisuje najmanju vrijednost u nizu.
 */

public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] array = new double[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}

		input.close();

		System.out.printf(" Najmanja vrijednost u nizu je %.3f ", min(array));
	}

	public static double min(double[] array) {

		double min = array[0];

		for (double n : array) {
			if (n < min) {
				min = n;
			}
		}

		return min;

	}
}
