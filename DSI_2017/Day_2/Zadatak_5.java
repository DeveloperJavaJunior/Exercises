package day_2;

import java.util.*;

public class Zadatak_5 {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print("Enter a number:");
		int n = in.nextInt();

		revese(n);
	}

	public static void revese(int number1) {

		int number = Math.abs(number1);

		if (number >= 0 && number < 10)
			System.out.println(number);
		else {
			while (number != 0) {
				int reverse = number % 10;
				System.out.print(reverse);
				number /= 10;
			}
		}
	}

}
