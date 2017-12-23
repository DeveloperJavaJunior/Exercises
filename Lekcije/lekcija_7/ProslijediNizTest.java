package lekcija_7;

public class ProslijediNizTest {

	/** Metoda koja zamjenjuje dvije varijable */
	public static void zamijeni(int b1, int b2) {

		int privremena = b1;
		b1 = b2;
		b2 = privremena;

	}

	/** Metoda koja zamjenjuje prva dva elementa u nizu */
	public static void zamijeniPrvaDvaUNizu(int[] niz) {

		int privremena = niz[0];
		niz[0] = niz[1];
		niz[1] = privremena;

	}

	/** Main metoda */
	public static void main(String[] args) {

		int[] niz = { 4, 5 };

		System.out.println("Prije pozivanja zamijeni metode");
		System.out.println("\tniz je: {" + niz[0] + ", " + niz[1] + "}");

		zamijeni(niz[0], niz[1]);

		System.out.println("Nakon pozivanja zamijeni metode");
		System.out.println("\tniz je: {" + niz[0] + ", " + niz[1] + "}");

		System.out.println("Prije pozivanja zamijeniPrvaDvaUNizu metode");
		System.out.println("\tniz je: {" + niz[0] + ", " + niz[1] + "}");

		zamijeniPrvaDvaUNizu(niz);

		System.out.println("Nakon pozivanja zamijeniPrvaDvaUNizu metode");
		System.out.println("\tniz je: {" + niz[0] + ", " + niz[1] + "}");
	}

}
