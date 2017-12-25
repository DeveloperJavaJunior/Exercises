package exercises_Array_Week_2;

import java.util.Scanner;

/**
 * 23.11.2017
 * 
 * @author A
 *
 *         Napisati metodu koja pronalazi najmanji element u nizu po neparnim
 *         indeksima. Napisati testni program koji pita korisnika da unese 10
 *         cijelih brojeva, a zatim ispisuje najmanji element koji se nalazi na
 *         neparnoj poziciji u nizu.
 */

public class Ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];

		System.out.print(" Unesite niz od 10 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		input.close();
		
		System.out.printf(" Najmenji elemenat u nizu na neparnim elementima je: %d ", minOddElement(array));
		
	}
	public static int minOddElement(int[] array) {
		
		int min = array[1];
		
		
		for (int i = 0; i < array.length; i++) {
			if(i % 2 != 0 &&  min > array[i]){
				min = array[i];
			
			}
			}
		return min;
			
		}
		
	}

