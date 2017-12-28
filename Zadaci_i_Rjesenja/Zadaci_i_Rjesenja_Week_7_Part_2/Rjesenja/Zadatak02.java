package week07_2;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("Najmanji element na neparnom indeksu: " + min(arr));
	}
	
	public static int min(int[] array) {
		int min = array[1];
		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0 && min > array[i]) {
				min = array[i];
			}
		}
		
		return min;

	}
}
