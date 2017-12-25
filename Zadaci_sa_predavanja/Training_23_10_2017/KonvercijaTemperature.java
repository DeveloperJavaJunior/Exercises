package training_23_10_2017;

import java.util.Scanner;

public class KonvercijaTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite temperaturu u clziusima:");
		double celsius = input.nextInt();
		
		input.close();
		
		double fahrenheite = (9.0 / 5.0) * celsius + 32;
		
		System.out.printf(" %.0f celsiusa je %.1f fahrenheta.", celsius, fahrenheite);

	}

}
