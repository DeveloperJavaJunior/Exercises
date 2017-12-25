package exercises_Array_Week_2;

public class EX4 {

	/** Test metoda koje dodjeluje nove vrijednosti prosljedjenim argumentima */
	public static void metoda(int broj, int[] brojevi) {
		broj = 42;
		brojevi[0] = 777;
	}

	public static void main(String[] args) {

		int a = 1;
		int[] b = new int[5];

		System.out.println("Prije pozivanja metode, vrijednost a je: " + a);
		System.out.println("Prije pozivanja metode, vrijednost b[0] je: " + b[0]);

		// pozvati test metodu sa argumentima a i b
		metoda(a, b);

		System.out.println("\nNakon pozivanja metode, vrijednost a je: " + a);
		System.out.println("Nakon pozivanja metode, vrijednost b[0] je: " + b[0]);

	}
}