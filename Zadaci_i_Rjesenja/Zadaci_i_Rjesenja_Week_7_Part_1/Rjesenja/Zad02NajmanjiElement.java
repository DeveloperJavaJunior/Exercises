import java.util.Scanner;

public class Zad02NajmanjiElement {

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// ispis poruke
		System.out.println("Unesite niz od 10 brojeva: ");
		// novi niz cija je duzina 10
		double[] array = new double[10];
		// dodavanje elemenata u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextDouble();
		}
		// zatvaranje Scannera
		input.close();
		// ispis rezultata
		System.out.println("Najmanji element u nizu je: " + min(array));
	}

	/**
	 * Metoda pronalazi najmanju vrijednost u nizu
	 * 
	 * @param array
	 *            niz u kome treba pronaci najmanju vrijednost
	 * @return najmanji element u nizu
	 */
	public static double min(double[] array) {
		// postavljamo najmanji element na prvi element niza
		double min = array[0];
		// prolazimo sve elemente niza
		for (double num : array) {
			// ako je element manji od trenutno najmanje vrijednosti, 
			// nova najmanja vrijednost je vrijednost tog elementa
			if (num < min) {
				min = num;
			}
		}
		// vracanje najmanje vrijednosti
		return min;
	}
}
