package week05;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pass = input.nextLine();
		boolean isValid = true;
		int countDig = 0;

		if (pass.length() < 8) {
			isValid = false;
		} else {
			for (int i = 0; i < pass.length(); i++) {
				char ch = pass.charAt(i);
				if (!Character.isLetterOrDigit(ch)) {
					isValid = false;
					break;
				} else if (Character.isDigit(ch)) {
					countDig++;
				}
			}
		}

		if (isValid && countDig >= 2) {
			System.out.println("Valid password");
		} else {
			System.out.println("Invalid password");
		}

	}

}
