package week03_2;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite cijeli broj: ");
		int broj = unos.nextInt();
		
		System.out.print("Broj ispisan naopako: ");
		while( broj != 0) {
			int cifra = broj % 10;
			System.out.print(cifra);
			broj /= 10;
		}
		
		unos.close();
	}

}
