import java.util.Scanner;

public class Zad01TriBroja {
	/**
	 * Metoda ispisuje tri broja u rastucem redoslijedu
	 * @param num1  prvi broj
	 * @param num2  drugi broj
	 * @param num3  treci broj
	 */
	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		
		// ako je prvi broj veci od drugog, mijenjamo im vrijednosti
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// ako je drugi broj veci od treceg, mijenjamo im vrijednosti
		if (num2 > num3) {
			double temp = num2;
			num2 = num3;
			num3 = temp;
		}
		// ako je doslo do promjene zamjene drugog i treceg broja, 
		// provjeravamo da li je prvi veci od drugog i mijenjamo im vrijednosti
		if (num1 > num2) {
			double temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// ispis brojeva
		System.out.println(num1 + " " + num2 + " " + num3);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri broja: ");
		// uzimanje unosa od korisnika
		double first = input.nextDouble();
		double second = input.nextDouble();
		double third = input.nextDouble();
		input.close();
		// pozivanje metode za ispis sortiranih brojeva
		displaySortedNumbers(first, second, third);
	}

}
