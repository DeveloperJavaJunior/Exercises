package exercises;

/**
 * 
 * Napisati program koji ispisuje prvih 50 prostih brojeva,10 po liniji. Broj je
 * prost ako je djeljiv samo sa sobom. Koristiti 2 metode, jedna koja printa
 * brojeve a druga koja provjerava je li broj prost i vra�a boolean vrijednost.
 * Header metode koja printa je : public static void printNumbers(int
 * numerOfPrimes)
 * 
 * Header metode koja provjerava je li prost je: public static boolean
 * isPrime(int num)
 * 
 * (Zna�i trebaju 2 metode, iz main metode poziva� printNumbers(50), a iz
 * printNumber metode poziva� isPrime(num))
 * 
 *
 *
 */

public class ProstiBrojevi {

	public static void main(String[] args) {

		printNumbers(50);

	}

	public static void printNumbers(int numberOfPrime) {

		int count = 0;
		int num = 2;

		while (count < numberOfPrime) {
			if (isPrime(num)) {
				count++;
				System.out.print(num + " ");
				if (count % 10 == 0) {
					System.out.println();

				}
			}
			num++;

		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}
}
