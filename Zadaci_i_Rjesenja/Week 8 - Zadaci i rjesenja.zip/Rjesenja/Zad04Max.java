import java.util.Scanner;

public class Zad04Max {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.println("Unesite 10 decimalnih vrijednosti:");
		// unosenje 10 decimalnih vrijednosti u niz

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		input.close();
		double result = max(array);
		System.out.println("Najveci element je: " + result);// stampanje
															// rezultata
	}

	private static double max(double[] array) {
		double max = array[0];
		for (double num : array) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

}
