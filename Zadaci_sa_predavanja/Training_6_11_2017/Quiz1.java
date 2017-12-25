package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Prepraviti zadatak sa po�etka �asa (oduzimanje) na sljede�i na�in:
 *         Ukoliko korisnik unese ta�an odgovor, program mu �estita i zavr�ava s
 *         radom.
 * 
 *         Ukoliko korisnik unese pogre�an odgovor, program ispisuje da je
 *         odgovor pogre�an te postavlja pitanje sve dok korisnik ne unese ta�an
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