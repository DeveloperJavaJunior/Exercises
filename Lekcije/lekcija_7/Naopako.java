package lekcija_7;

public class Naopako {

	public static int[] naopako(int[] niz) {

		int[] rezultat = new int[niz.length];

		for (int i = 0, j = rezultat.length - 1; i < niz.length; i++, j--) {
			rezultat[j] = niz[i];
		}
		return rezultat;

	}

	public static void main(String[] args) {

		int[] lista = { 1, 2, 3, 4, 5, 6, 7 };
		int[] lista2 = naopako(lista);

		System.out.print("Niz naopako: ");
		for (int i = 0; i < lista2.length; i++) {
			System.out.print(lista2[i] + " ");
		}

	}

}
