package lekcija_6;

public class SumeMetoda {

	/** metoda koja vraca sumu */
	public static int suma(int a, int b) {

		int suma = 0;

		for (int i = a; i <= b; i++) {
			suma += i;
		}
		return suma;
	}

	/** main metoda */
	public static void main(String[] args) {

		System.out.println("Suma svih brojeva u rasponu od 1 do 10 je: " + suma(1, 10));
		System.out.println("Suma svih brojeva u rasponu od 34 do 67 je: " + suma(34, 67));
		System.out.println("Suma svih brojeva u rasponu od 82 do 98 je: " + suma(82, 98));

	}

}
