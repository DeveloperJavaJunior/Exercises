package week05;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Zadatak12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite iznos: ");
		int result = input.nextInt();
		int coinCount = 0;
		while (result != 0) {
			if (result - 5 >= 0) {
				result -= 5;
				coinCount++;
			} else if (result - 3 >= 0) {
				result -= 3;
				coinCount++;
			} else if (result - 1 >= 0) {
				result -= 1;
				coinCount++;
			}
		}
		
		
		System.out.println("Broj potrebnih novcica: " + coinCount);
	}

}
