package training_6_11_2017;

import java.util.Scanner;

/**
 * @author Edin Korkic
 * 
 *         Napisati program koji generiše dva cijela, nasumièna broja te traži
 *         od korisnika da odgovori pitanje tipa: “Koliko je 8 - 3?” gdje su 8 i
 *         3 nasumièno generisani brojevi. Ispisati rezultat korisniku - ako je
 *         tacan, cestitati ako nije - ispisati tacan odgovor.
 * 
 *         Ukoliko je prvi generisani broj manji od drugog, program treba da im
 *         zamijeni pozicije - rezultat oduzimanja ne smije biti negativan broj.
 *
 * 
 */

public class Quiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);

		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		int num3 = num1 - num2;

		System.out.format(" Koliko je %d - %d = ", num1, num2);

		int odgovor = input.nextInt();

		input.close();

		if (num3 == odgovor) {
			System.out.format(" Vas odgovor je tacan");

		} else {
			System.out.format(" Vas odgovor nije tacan,odgovor je %d", num3);
		}

	}

}
