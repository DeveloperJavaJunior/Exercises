package zadaci_sa_predavanja_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te 
 *  ispisuje najveæi i najmanji zajednièki djelilac za ta dva broja.
 */

public class Zadatak_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite dva cijela broja: ");

		int num1 = input.nextInt();
		int num2 = input.nextInt();

		input.close();
		
		int count = 0;

		int greatDivisor = 1;
		int smalestDivisor = 1;

		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
			for (int i = 2; i <= num2; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					count++;
					greatDivisor = i;
				if(count == 1){
					smalestDivisor = i;
				}}
				
			}
			System.out.printf(" Najveci zajednicki djelilac za broj %d i broj %d je %d\n", num1, num2, greatDivisor);
			System.out.printf(" Najmanji zajednicki djelilac za broj %d i broj %d je %d ", num1, num2, smalestDivisor);
		}

	}


