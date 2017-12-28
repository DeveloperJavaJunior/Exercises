import java.util.Scanner;

public class Zad06IdenticniNizovi {
	/**
	 * Metoda ispituje da li su proslijedjeni nizovi identicni Identicni su ako
	 * im je na istim indeksima ista vrijednost
	 * 
	 * @param array1
	 *            prvi niz
	 * @param array2
	 *            drugi niz
	 * @return true ako su identicni, false ako nisu
	 */
	public static boolean equals(int[] array1, int[] array2) {
		// ako su nizovi razlicite duzine, onda nisu identicni
		if (array1.length != array2.length) {
			return false;
		} else { // ako jesu iste duzine
			// provjeravamo da li je na istim indeksima oba niza ista vrijednost
			for (int i = 0; i < array1.length; i++) {
				// ako nije ista vrijednost, nizovi nisu identicni
				if (array1[i] != array2[i]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// novi niz od 5 elemenata
		int[] niz1 = new int[5];
		// novi niz od 5 elemenata
		int[] niz2 = new int[5];

		System.out.print("Unesite prvi niz od 5 brojeva: ");
		// unosenje elemenata u prvi niz
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = input.nextInt();
		}

		System.out.print("Unesite drugi niz od 5 brojeva: ");
		// unosenje elemenata u drugi niz
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = input.nextInt();
		}

		// zatvaranje Scannera
		input.close();

		// ispis poruke u zavisnosti da li su nizovi identicni ili nisu
		if (equals(niz1, niz2)) {
			System.out.println("Nizovi su identicni.");
		} else {
			System.out.println("Nizovi nisu identicni.");
		}
	}

}
