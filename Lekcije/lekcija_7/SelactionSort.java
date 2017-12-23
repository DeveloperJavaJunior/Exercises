package lekcija_7;

public class SelactionSort {

	/** Metoda koja implementira selection sort algoritam */
	public static void selectionSort(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			// naci najmanji broj u nizu
			int trenutnoNajmanji = niz[i];
			int trenutnoNajmanjiIndex = i;
			for (int j = i + 1; j < niz.length; j++) {
				if (trenutnoNajmanji > niz[j]) {
					trenutnoNajmanji = niz[j];
					trenutnoNajmanjiIndex = j;

				}
			}
			// zamijeni niz[i] sa niz[trenutniNajmanjiIndex] ukoliko je potrebno
			if (trenutnoNajmanjiIndex != i) {
				niz[trenutnoNajmanjiIndex] = niz[i];
				niz[i] = trenutnoNajmanji;
			}

		}
	}

	/** Metoda koja ispisuje niz na konzoli */
	public static void ispisiNiz(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	/** Main metoda */
	public static void main(String[] args) {

		int[] niz = { 3, 5, 3, 2, 5, 6, 7, 8, 9, 44, 3, 2, -5 };

		System.out.println("Niz prije sortiranja izgleda ovako: ");
		ispisiNiz(niz);

		selectionSort(niz);

		System.out.println("\n\nNiz poslije sortiranja izgleda ovako: ");
		ispisiNiz(niz);

	}

}
