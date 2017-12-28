package week07_2;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		printSums(arr);
	}

	private static void printSums(int[] arr) {
		int sumOdd = 0, sumEven = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0){
				sumEven += arr[i];
			} else {
				sumOdd += arr[i];
			}
		}
		
		System.out.println("Suma parnih elemenata: " + sumEven);
		System.out.println("Suma neparnih elemenata: " + sumOdd );
	}

}
