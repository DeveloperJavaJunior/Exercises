package lekcija_4;

import java.util.Scanner;

public class Zadatak2Ocjene {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print("Unesite ocjenu: ");
		String ocjena = unos.next();
		unos.close();

		switch (ocjena) {

		case "A":
			System.out.println("Vasa ocjena je 5.");
			break;
		case "B":
			System.out.println("Vasa ocjena je 4.");
			break;
		case "C":
			System.out.println("Vasa ocjena je 3.");
			break;
		case "D":
			System.out.println("Vasa ocjena je 2.");
			break;
		case "F":
			System.out.println("Vasa ocjena je 1.");
			break;
		default:
			System.out.println("Unijeli ste pogresnu ocjenu.");
			break;

		}

	}

}