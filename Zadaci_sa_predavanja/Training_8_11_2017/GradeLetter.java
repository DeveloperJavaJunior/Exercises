package training_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese ocjenu  kao slovo (A, B, C, D ili F) i
 *  ispisuje mu odgovarajuæu numerièku ocjenu (5, 4, 3, 2 ili 1).
 */

public class GradeLetter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite ocjenu kao slovo(A,B,C,D,F): ");

		char ch = input.next().charAt(0);
		input.close();

		switch (ch) {
		
		case 'A':
			System.out.format(" Vasa ocjena je 5. ");
			break;
		case 'B':
			System.out.format(" Vasa ocjena je 4. ");
			break;
		case 'C':
			System.out.format(" Vasa ocjena je 3. ");
			break;
		case 'D':
			System.out.format(" Vasa ocjena je 2. ");
			break;
		case 'F':
			System.out.format(" Vasa ocjena je 1. ");
			break;
		default:
			System.out.format(" Pogresan unos! ");

		}
	}

}
