package week03_2;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi cijeli broj: ");
		int n = unos.nextInt();
		System.out.print("Faktori broja " + n + " su: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		unos.close();
	}

}
