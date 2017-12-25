package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji traži od korisnika da unese cijeli broj i odredjuje da li je 
 *  uneseni broj djeljiv i sa 5 i sa 6, da li je djeljiv sa 5 ili sa 6 i da li je
 *  djeljiv sa 5 ili 6, ali ne sa oba.
 *  Sample run programa:
 *  Unesite cijeli broj: 10
 *  Da li je broj djeljiv i sa 5 i sa 6? false
 *  Da li je broj djeljiv sa 5 ili sa 6? true
 *  Da li je broj djeljiv sa 5 ili sa 6, ali ne sa oba? true
 *
 */

public class Zadatak_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite cijeli broj:");
		int number = input.nextInt();

		input.close();
		
		boolean condition1 = number % 5 == 0 && number % 6 == 0;
		boolean condition2 = number % 5 == 0 || number % 6 == 0;
		boolean condition3 = number % 5 == 0 ^ number % 6 == 0;
		
		System.out.printf(" da li je broj djeljiv i sa 5 i sa 6? %b \n", condition1);
		System.out.printf(" da li je broj djeljiv sa 5 ili sa 6? %b \n", condition2);
		System.out.printf(" da li je broj djeljiv sa 5 ili sa 6,ali ne sa oba? %b ", condition3);
		

	}

}
