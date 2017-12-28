package week03_2;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite broj: ");
		int broj = unos.nextInt();
		int suma = 0;
		for (int i = 1; i <= broj; i++) {
			if (i % 2 == 0) {
				suma += i;
			}
		}

		System.out.println("Suma parnih brojeva izmedju 1 i " + broj
				+ " iznosi: " + suma);
		
		unos.close();
	}
}
