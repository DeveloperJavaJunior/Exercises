package lekcija_7;

public class Proslijedi2DNiz {

	/** Metoda koja vraca 3x3 niz */
	public static int[][] vratiNiz() {
		java.util.Scanner unos = new java.util.Scanner(System.in);

		// unijeti vrijednosti u niz
		int[][] niz = new int[3][3];

		System.out.print("Molimo vas unesite " + niz.length + " reda i " + niz[0].length + " kolone: ");
		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				niz[i][j] = unos.nextInt();
			}
		}
		unos.close();
		return niz;
	}

	/** Metoda koja vraca zbir svi elemenata niza */
	public static int suma(int[][] niz) {

		int zbir = 0;

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz[i].length; j++) {
				zbir += niz[i][j];
			}
		}
		return zbir;
	}

	/** Main metoda */
	public static void main(String[] args) {

		int[][] niz = vratiNiz();

		System.out.println("\nZbir svih elemenata niza je: " + suma(niz));

	}

}
