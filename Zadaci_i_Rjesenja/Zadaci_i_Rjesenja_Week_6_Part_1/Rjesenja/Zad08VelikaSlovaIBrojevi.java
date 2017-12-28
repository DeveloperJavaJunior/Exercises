public class Zad08VelikaSlovaIBrojevi {
	/**
	 * Metoda ispisuje 100 nasumicnih velikih slova, a zatim 100 jednocifrenih
	 * brojeva, i to po 10 u liniji
	 */
	public static void randomUpperCaseLettersAndDigits() {
		int count = 0; // brojac ispisa po liniji
		for (int i = 0; i < 100; i++) {
			// ispis random upper case karaktera (65 - A ... 90 - Z)
			System.out.print((char) (65 + (int) (Math.random() * 26)) + " ");
			count++;
			// ako je ispisano 10 karaktera, prelazi se u novu liniju
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}

		for (int j = 0; j < 100; j++) {
			// ispis nasumicnog jednocifrenog broja
			System.out.print((int) (Math.random() * 10) + " ");
			count++;
			// ako je ispisano 10 brojeca, prelazi se u novu liniju
			if (count == 10) {
				System.out.println();
				count = 0;
			}
		}

	}

	public static void main(String[] args) {
		// pozivanje metode za ispis nasumicnih velikih slova i brojeva
		randomUpperCaseLettersAndDigits();
	}

}
