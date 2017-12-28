package week07_2;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		print(arr);
	}

	private static void print(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if((arr[i] + arr[i+1]) % 2 == 0){
				System.out.println(arr[i] + " " + arr[i+1]);
			}
		}
	}

}
