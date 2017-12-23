package lekcija_5;

public class WhilePrimjer {

	public static void main(String[] args) {

		int suma = 0, i = 1;

		while (i < 10) {
			suma += i; // suma = suma + 1;
				i++;
		}
		System.out.println("Suma prvih devet brojeva je: " + suma);
	}

}
