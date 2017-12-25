package training_23_10_2017;

import java.util.Scanner;

public class ZbirCifri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj(0 do 999):");
		int broj = input.nextInt();
		
		input.close();
		
		int prvaCifra = broj / 100;
		int drugaCifra = broj / 10 % 10;
		int trecaCifra = broj % 10;
		
		int suma = prvaCifra + drugaCifra + trecaCifra;
		
		System.out.printf(" Suma cifri broja %d je %d.", broj, suma);

	}

}
