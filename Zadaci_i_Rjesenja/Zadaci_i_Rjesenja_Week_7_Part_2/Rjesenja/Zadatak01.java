package week07_2;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Unesite duzinu niza: ");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Unesite " + n + " cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("Najveci element po apsolutnoj vrijednosti: " + max(arr));
	}

	public static int max(int[] array) {
		int max = Math.abs(array[0]);
		for (int i = 0; i < array.length; i++) {
			if (Math.abs(array[i]) > max) {
				max = Math.abs(array[i]);
			}
		}

		return max;
	}
}
