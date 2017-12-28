package week05;

import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {
		int countUpper = 0;
		int countLetters = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String str = input.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				countUpper++;
				countLetters++;
			} else if (Character.isLetter(ch)) {
				countLetters++;
			}
		}

		double percentUpper = (double) countUpper / countLetters * 100.0;
		System.out.println("Procenat velikih slova: " + percentUpper +"%");
		System.out.println("Udio malih slova: " + (100 - percentUpper) + "%");

	}

}
