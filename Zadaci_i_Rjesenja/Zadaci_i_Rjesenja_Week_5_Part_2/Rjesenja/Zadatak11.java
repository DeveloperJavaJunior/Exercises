package week05;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int number = input.nextInt();
		// System.out.println(Integer.toBinaryString(number));

		String result = "";
		while (number != 0) {
			result += number % 2;
			number /= 2;
		}
		String reverse = "";
		for (int i = result.length() - 1; i >= 0; i--) {
			reverse += result.charAt(i);
		}

		System.out.println(reverse);
	}

}
