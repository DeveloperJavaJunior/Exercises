package zadaci;

public class Zad1SerijaBrojeva {
	public static void main(String[] args) {
		
		double suma = 0; // suma
		
		for(int i = 1; i < 98; i += 2) {
			// suma = suma + (i / (i + 2))
			suma += i / (i + 2.0);
		}
		
		// ispis sume
		System.out.println("Suma serije brojeva je: " + suma);
	}
}
