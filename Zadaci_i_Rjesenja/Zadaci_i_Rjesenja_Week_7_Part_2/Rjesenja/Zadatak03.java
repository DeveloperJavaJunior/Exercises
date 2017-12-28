package week07_2;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Unesite 10 cijelih brojeva: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		System.out.println("Suma pozitivnih elemenata djeljivih sa 3: " + sum(arr));
	}

	public static int sum (int[] array){
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > 0 && array[i] % 3 == 0){
				sum += array[i];
			}
		}
		
		return sum;
	}
}
