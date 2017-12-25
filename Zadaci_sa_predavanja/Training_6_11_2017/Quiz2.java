package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Napisati program koji generiše cijeli, nasumièan broj u rasponu od 0
 *         do 10 te pita korisnika da pogodi koji je broj generisan.
 * 
 *         Ukoliko korisnik unese veæi broj od generisanog, program ispisuje da
 *         je broj veæi te pita korisnika da pokuša ponovo sa manjim brojem.
 *         Ukoliko unese manji - pokušaj ponovo sa veæim brojem.
 * 
 *         Kada korisnik pogodi broj, program mu èestita i završava sa radom.
 * 
 */

public class Quiz2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number = (int) (Math.random() * 10);

		System.out.print(" Unesite random broj od 0 do 10: ");

		int answer;

		while ((answer = input.nextInt()) != number) {

			if (answer == number) {
				System.out.format(" Cestitamo vas ogovor je tacan!");

			} else if (answer <= 5) {
				System.out.format(" Vas odgovor je netacan,pokusajte sa vecim brojem");

			} else {
				System.out.format(" Vas odgovor je netacan,pokusajte sa manjim brojem");

			}
		}
	}

}
