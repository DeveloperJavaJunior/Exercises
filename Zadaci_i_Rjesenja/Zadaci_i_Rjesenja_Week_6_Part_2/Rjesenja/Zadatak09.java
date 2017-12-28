package week06;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja: ");
		int num = input.nextInt();
		question(num);
	}

	public static void question(int number) {
		int rightAnswers = 0;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < number; i++) {
			int num01 = (int) (Math.random() * 10);
			int num02 = (int) (Math.random() * 10);

			int result = num01 - num02;
			System.out.println("Koliko je " + num01 + " - " + num02);
			int answer = input.nextInt();
			if (answer == result) {
				rightAnswers++;
			}
		}
		
		System.out.println("Number of correct answers " + rightAnswers);
		System.out.println("Number of wrong answers " + (number - rightAnswers));
	}

}
