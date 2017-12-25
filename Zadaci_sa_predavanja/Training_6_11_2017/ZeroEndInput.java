package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Napisati program koji pita korisnika da unosi cijele brojeve sve dok
 *         korisnik ne unese 0.
 * 
 *         Kada korisnik unese nulu, program ispisuje zbir svih unesenih
 *         brojeva, prosjek svih unesenih brojeva te završava sa radom.
 * 		   
 */

public class ZeroEndInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite niz brojrva (0 zaustavlja unos): ");

		int num;

		int countPos = 0;
		int countNeg = 0;
		double sum = 0;

		while ((num = input.nextInt()) != 0) {
			sum += num;
			if (num > 0) {
				countPos++;
			} else {
				countNeg++;
			}

		}
		double avg = sum / (countPos + countNeg);

		System.out.format(" Unijeli ste pozitivnih %d brojeva\n", countPos);
		System.out.format(" Unijeli ste negativnih %d brojeva\n", countNeg);
		System.out.format(" Suma brojeva je %.2f\n", sum);
		System.out.format(" Prosjek unesenih brojeva %.2f\n", avg);
		System.out.format(" Duzina unijetog niza brojeva je %d ", (countPos + countNeg));

	}

}
