package week06;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj bacanja: ");
		int num = input.nextInt();
		flipCoins(num);
	}

	private static void flipCoins(int num) {
		int heads = 0;
		for (int i = 0; i < num; i++) {
			int coin = (int) (Math.random() * 2);
			if (coin == 0) {
				heads++;
			}
		}

		System.out.println("Glava se pojavila " + heads + " puta, a pismo "
				+ (num - heads) + " puta.");
	}

}
