package exercises_Array_Week_1;

import java.util.Scanner;

/**
 * 21.11.2017
 * 
 * @author A Nizovi array1 i array2 su identièni ako su im vrijednosti elemenata
 *         na odgovarajuæim indeksima jednake. Napisati metodu koja vraæa true
 *         ako su nizovi arraz1 i array2 identièni, odnosno false ako nisu
 *         identièni. Metoda ima sledeæi header: public static boolean
 *         equals(int[] array1, int[] array2). Napisati test program koji kaže
 *         korisniku da unese dva niza od 5 elemenata, a zatim provjerava i
 *         ispisuje da li su nizovi identièni ili nisu.
 */

public class Ex_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array1 = new int[5];
		int[] array2 = new int[5];

		System.out.print(" Unesite niz od 5 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array1.length; i++) {
			array1[i] = input.nextInt();
		}

		System.out.print(" Unesite niz od 5 brojeva odvojenih spaceom: ");

		for (int i = 0; i < array2.length; i++) {
			array2[i] = input.nextInt();
		}

		input.close();
		// System.out.printf(" Nizovi array1 i array2 " + (equals(array1,array2)?"su": "nisu")+ " jednaki ");
		if(equals(array1,array2)){
			System.out.printf(" Nizovi array1 i array2 su jednaki ");
		}else{
			System.out.printf(" Nizovi array1 i array2 nisu jednaki ");
		}
	}

	public static boolean equals(int[] array1, int[] array2) {

		if (array1.length != array2.length) {
			return false;
		} else { // ako jesu iste duzine
			// provjeravamo da li je na istim indeksima oba niza ista vrijednost
			for (int i = 0; i < array1.length; i++) {
				// ako nije ista vrijednost, nizovi nisu identicni
				if (array1[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}
	}}

//