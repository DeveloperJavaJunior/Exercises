package week03_2;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite mjesecni iznos stednje: ");
		double iznos = unos.nextDouble();
		System.out.print("Unesite broj mjeseci stednje: ");
		int mjeseci = unos.nextInt();
		double suma = 0;
		double kamata = 0.05 / 12;
		
		for (int i = 0; i < mjeseci; i++) {
			suma = (iznos + suma) * (1 + kamata);
		}

		System.out.printf("Stanje na racunu je %.3f KM", suma);
		unos.close();
	}

}
