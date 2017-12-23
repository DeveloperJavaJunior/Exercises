package lekcija_7;

public class BinarnoPretazivanje {

	/** Metoda koja implementira algoritam za binarno pretrazivanje */
	public static int binarno(int[] niz, int kljuc) {

		int najnizi = 0;
		int najvisi = niz.length - 1;

		while (najvisi >= najnizi) {

			int srednji = (najnizi + najvisi) / 2;

			if (kljuc < niz[srednji]) {
				najvisi = srednji - 1;
			} else if (kljuc == niz[srednji]) {
				return srednji;
			} else {
				najnizi = srednji + 1;
			}
		}

		return -najnizi - 1;
	}

	/** Main metoda */
	public static void main(String[] args) {

		int[] niz = { 2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79 };

		System.out.println("Element 2 se nalazi na poziciji: " + binarno(niz, 2));
		System.out.println("Element 11 se nalazi na poziciji: " + binarno(niz, 11));
		System.out.println("Element 12 se nalazi na poziciji: " + binarno(niz, 12));
	}

}
