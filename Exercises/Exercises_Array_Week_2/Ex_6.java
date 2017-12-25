package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 21.11.2017
 * 
 * @author A
 *
 *         Napisati program koji pita korisnika da unese 10 cijelih brojeva u
 *         niz, a zatim izraèunava i ispisujesumu parnih i neparnih elemenata
 *         niza odvojeno.
 */

public class Ex_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();
		
		System.out.printf(" Suma parnih brojeva u nizu je %d \n", sumOfEven(array));
		System.out.printf(" Suma neparnih brojeva u nizu je %d ", sumOfOdd(array));
	}
public static int sumOfEven(int[] array) {
	
	int sum = 0;
	
	for(int n : array){
		if(n % 2 == 0){
			sum += n;
		}
	}
	return sum;
}
	public static int sumOfOdd(int[] array) {
		
		int sum = 0;
		
		for(int n : array){
			if(n % 2 != 0){
				sum += n;
	
			}
}
		return sum;

	}
}
