package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Prepraviti zadatak sa poèetka èasa (oduzimanje) na sljedeæi naèin:
 *         Ukoliko korisnik unese taèan odgovor, program mu èestita i završava s
 *         radom.
 * 
 *         Ukoliko korisnik unese pogrešan odgovor, program ispisuje da je
 *         odgovor pogrešan te postavlja pitanje sve dok korisnik ne unese taèan
 *         odgovor.
 * 
 * 
 */
public class Quiz1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int answer;

		int num3 = num1 - num2;

		System.out.format(" Koliko je %d - %d = ", num1, num2);
		
		while ((answer = input.nextInt()) != num3) {
			
			System.out.format(" Vas odgovor nije tacan,pokusajte ponovo ");
			
		}
				System.out.format(" Vas odgovor je tacan");

		}

	}