package exercises;

/**
 * 
 * Napisati program koji uèitava neodreðen broj cijelih brojeva, odreðuje koliko
 * je uneseno pozitivnih a koliko negativnih brojeva, te ispisuje njihov zbir
 * kao i prosjek. Unos se završava nulom. (Nula se ne broji prilikom prosjeka).
 * Primjer: Unesite cijele brojeve,unos se prekida nulom: 1 2 -1 3 0 Broj
 * pozitivnih brojeva je: 3 Broj negativn8ih brojeva je: 1 Ukupni zbir je: 5
 * Prosjek je: 1.25
 *
 */

public class PozitivniiNegativniBrojevi {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite niz brojeva(0 zaustavlja unos):");

		int countPos = 0;
		int countNeg = 0;
		double sum = 0;

		for (int n; (n = in.nextInt()) != 0;) {
			sum += n;
			if (n > 0) {
				countPos++;
			} else {
				countNeg++;
			}
		}
		in.close();
		double average = sum / (countPos + countNeg);

		System.out.format(" Uneseno je %d pozitivnih brojeva.\n", countPos);
		System.out.format(" Uneseno je %d negativnih brojeva.\n", countNeg);
		System.out.format(" Suma brojeva je %.2f.\n", sum);
		System.out.format(" Prosjek brojeva je %.2f.", average);

	}

}
