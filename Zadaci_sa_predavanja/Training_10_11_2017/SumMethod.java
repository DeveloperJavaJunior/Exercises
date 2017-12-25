package training_10_11_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati metode koja vraæa rezultat sabiranja dva cijela ili decimalna broja. 
 *  Poziv metode sabiranje(2, 4) treba da vrati 6.
 *  Poziv metode sabiranje(2.0, 4.00) treba da vrati 6.0.
 */

public class SumMethod {

	public static void main(String[] args) {

		System.out.println(sum(2, 4));
		System.out.println(sum(2.0, 4.0));

	}

	public static int sum(int num1, int num2) {
		
		int sum;

		return sum = num1 + num2;
	}

	public static double sum(double num1, double num2) {
		
		double sum;
		
		return sum = num1 + num2;

	}
}