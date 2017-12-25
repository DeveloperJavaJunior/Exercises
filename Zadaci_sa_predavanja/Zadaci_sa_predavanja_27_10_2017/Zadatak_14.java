package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji pita korisnika da unese tri cijela broja, a zatim ih ispisuje u
 *  rastuæem redoslijedu.
 *  Sample run programa:
 *  Unesite tri cijela broja: 4 1 3
 *  Brojevi u rastucem redoslijedu: 1 3 4
 *
 */

public class Zadatak_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite tri cijela broja:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		input.close();

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.printf(" Brojevi u rastucem redoslijedu: %d %d %d ", num1, num2, num3);
	}

}
