package lekcija_7;

import java.util.Arrays;
import java.util.Scanner;

public class EqualsSortArrays {

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

		System.out.printf(" Nizovi array1 i array2 " + (equals(array1, array2) ? "su" : "nisu") + " jednaki!");

	}

	public static int[] sort1(int[] array1) {

		Arrays.sort(array1);
		return array1;
	}

	public static int[] sort2(int[] array2) {
		Arrays.sort(array2);
		return array2;
	}

	public static boolean equals(int[] array1, int[] array2) {

		return Arrays.equals(sort1(array1), sort2(array2));
		
	}
}
// return java.util.Arrays.equals(array1, array2);
// return java.util.Arrays.binarySearch(array, key);
//System.out.println(Arrays.toString(array));
// 