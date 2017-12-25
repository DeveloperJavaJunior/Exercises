package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 22.11.2017
 * 
 * @author A
 *
 *         Napisati program koji pita korisnika da unese niz od 10 cijelih
 *         brojeva, a zatim izraèunava i ispisujesumu pozitivnih èlanova niza
 *         djeljivih sa 3.
 */
public class Ex_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];
		
		System.out.print(" Unesite niz od 10 brojeva: ");
		
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextInt();
		}
		input.close();
		System.out.printf(" Suma pozitivnih brojeva u nizu djeljivih sa 3 je %d \n", sumOfDivisable(array));

	}
	public static int sumOfDivisable(int[] array) {
		
		int sum = 0;
		
		for(int n : array){
			if(n  > 0 && n % 3 == 0){
				sum += n;
			}
		}
		return sum;
	}
}
