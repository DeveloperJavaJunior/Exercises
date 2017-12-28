package week06;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		input.close();
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				System.out.print(getNumber(Character.toUpperCase(ch)));
			} else {
				System.out.print(ch);
			}
		}
		
	}

	public static int getNumber(char uppercaseLetter) {
		String letter = uppercaseLetter + "";
		if ("ABC".contains(letter)) {
			return 2;
		} else if ("DEF".contains(letter)) {
			return 3;
		} else if ("GHI".contains(letter)) {
			return 3;
		} else if ("DEF".contains(letter)) {
			return 4;
		} else if ("JKL".contains(letter)) {
			return 5;
		} else if ("MNO".contains(letter)) {
			return 6;
		} else if ("PQRS".contains(letter)) {
			return 7;
		} else if ("TUV".contains(letter)) {
			return 8;
		} else {
			return 9;
		}
	}
}
