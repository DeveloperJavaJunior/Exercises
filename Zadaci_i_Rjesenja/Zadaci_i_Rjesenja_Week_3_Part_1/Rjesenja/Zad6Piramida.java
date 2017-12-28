package zadaci;

import java.util.Scanner;

public class Zad6Piramida {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int number = input.nextInt();
		input.close();
		// vanjska petlja prolazi sve brojeve od 1 do unesenog broja
		for (int i = 1; i <= number; i++) {
			// petlja za razmake
			for (int j = number - 1; j >= i; j--) {
				System.out.print("  ");
			}
			// petlja za lijevu stranu piramide
			for (int k = i; k > 0; k--) {
				System.out.print(" " + k);
			}
			// petlja za desnu stranu piramide
			for (int m = 2; m <= i; m++) {
				System.out.print(" " + m);
			}
			// prelazak u novi red
			System.out.println();
		}
	}

}
