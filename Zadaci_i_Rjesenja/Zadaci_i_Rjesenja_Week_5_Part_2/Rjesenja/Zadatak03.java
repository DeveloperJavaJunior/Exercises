package week05;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int number = input.nextInt();
		System.out.println("The character for the ASCII code " + number + " is: " + (char)number);
	}

}
