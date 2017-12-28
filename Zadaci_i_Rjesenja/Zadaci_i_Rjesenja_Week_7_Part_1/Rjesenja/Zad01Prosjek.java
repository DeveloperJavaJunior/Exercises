import java.util.Scanner;

public class Zad01Prosjek {
	
	/**
	 * Metoda racuna cjelobrojni prosjek niza cijelih brojeva
	 * @param array niz cijelih brojeva ciji prosjek racunamo
	 * @return  prosjek elemenata niza
	 */
	public static int average(int[] array) {
		int sum = 0;
		// prolazimo kroz cijeli niz
		for (int e : array) {
			// dodajemo vrijednosti elemenata na varijablu suma
			sum += e;
		}
		// vracamo prosjek 
		return sum / array.length;
	}
	
	/**
	 * Metoda racuna prosjek niza double brojeva
	 * @param array niz double brojeva ciji prosjek racunamo
	 * @return  prosjek elemenata niza
	 */
	public static double average(double[] array) {
		double sum = 0;
		// prolazimo kroz cijeli niz
		for (double e : array) {
			// dodajemo vrijednosti elemenata na varijablu suma
			sum += e;
		}
		// vracamo prosjek 
		return sum / array.length;
	}

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
		// dobijanje prosjeka pozivanjem metode
		double average = average(array);
		// ispis rezultata
		System.out.println("Prosjek unesenih brojeva iznosi: " + average);
	}

}
