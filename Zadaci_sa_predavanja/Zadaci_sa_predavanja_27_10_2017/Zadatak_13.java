package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji uèitava od korisnika dva cijela broja i ispisuje da li 
 *  su oba broja pozitivna.
 *  Sample run programa:
 *  Unesite dva cijela broja: 43 27
 *  Oba broja su pozitivna.
 *
 */

public class Zadatak_13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite dva cijela broja:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		input.close();
		
		if(num1 > 0 && num2 > 0){
			System.out.printf(" Oba broja su pozitivna.");
		}else{
		System.out.printf(" Oba broja nisu pozitivna.");
		}
	}

}
