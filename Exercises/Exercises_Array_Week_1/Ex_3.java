package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 21.11.2017
 * 
 * @author A
 * 
 *         Napisati program koji uèitava neodreðeni broj cijelih brojeva (nula
 *         prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
 *         prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod
 *         prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik
 *         može unijeti 100.
 */

public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aboveAverage = 0;
		int underAverage = 0;
		int count = -1;
		double sum = 0;

		int[] array = new int[100];

		System.out.print(" Unesite niz do 100 brojeva(0 prekida unos): ");
		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			count++;
			if (num == 0) {
				break;
			}
		}

		input.close();

		for (int i = 0; i < array.length; i++) {
			sum += array[i];

		}

		double average = sum / count;

		for (int n : array) {
			if (n == 0) {
				break;
			}if (n >= average) {
					aboveAverage++;
				} else {
					underAverage++;

				
			}
		}

		System.out.printf(" Duzina niza koji ste unijeli je %d \n", (aboveAverage + underAverage));
		System.out.printf(" Suma niza koji ste unijeli je %.2f \n", sum);
		System.out.printf(" Prosjek niza koji ste unijeli je %.2f \n", average);
		System.out.printf(" Brojeva jednako ili iznad prosjeka %d \n", aboveAverage);
		System.out.printf(" Brojeva ispod prosjeka %d ", underAverage);
	}
}