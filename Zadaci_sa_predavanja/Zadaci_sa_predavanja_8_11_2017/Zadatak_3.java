package zadaci_sa_predavanja_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napi�ite program koji u�itava neodre�en broj cijelih brojeva (unos prekida nula),
 *  pronalazi najve�i od unijetih brojeva te ispisuje koliko se najve�i broj puta ponovio.
 *  Na primjer, ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najve�i broj 5 te 
 *  ispisuje da se isti ponavlja 4 puta
 */

public class Zadatak_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite niz cijelih brojeva(0 prekida unos): ");

		int numbers;
		int max = 0;
		int count = 0;

		while ((numbers = input.nextInt()) != 0) {
			if (numbers > max) {
				int temp = numbers;
				numbers = max;
				max = temp;
				count = 1;
			}
			else if (numbers == max) {
				count++;

			}
		}

		input.close();

		System.out.printf(" Najveci uneseni broj je: %d ", max);
		System.out.printf(" koji se ponavlaja %d puta..!", count);

	}

}
