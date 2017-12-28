public class Zad06SumaSerije {
	/**
	 * Metoda racuna sumu serije 1/2 + 2/3 + 3/4 + ... + i/i+1 za proslijedjeni
	 * broj i
	 * 
	 * @param num
	 *            broj koji predstavlja zadnji element serije (num/num+1) na
	 *            osnovu kojeg racunamo sumu seriju
	 * @return suma serije
	 */
	public static double sum(int num) {
		double sum = 0;
		// petlja prolazi brojeve od 1 do broja num, racuna element serije i/i+1
		// i dodaje na sumu
		for (int i = 1; i <= num; i++) {
			sum += i / (i + 1.0);
		}
		// vracanje rezultata
		return sum;
	}

	public static void main(String[] args) {
		// ispis zaglavlja tabele
		System.out.println("i\tm(i)");
		System.out.println("----------------");
		// petlja prolazi brojeve od 1 do 20 i za svaki broj poziva metodu za
		// racunanje sume definisane serije
		for (int i = 1; i <= 20; i++) {
			// ispis broja 'i' i izracunate sume, koja je zaokruzena na 4
			// decimale, razdvojenih tabom
			System.out.printf("%d\t%.4f\n", i, sum(i));
		}
	}

}
