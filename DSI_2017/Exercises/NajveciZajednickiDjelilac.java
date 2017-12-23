package exercises;

/**
 * 
 * Napisati program kojitraži od korisnika da unese dva cijela broja te ispisuje
 * njihov najveæi zajednièki djelilac. Primjer: Unesite 2 cijela pozitivna
 * broja: 8 12 Najveæi zajednièki djelilac je: 4
 * 
 * Primjer: Unesite 2 cijela pozitivna broja: 24 12 Najveæi zajednièki djelilac
 * je: 12
 *
 */

public class NajveciZajednickiDjelilac {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite dva broja:");

		int greaDiv = 0;

		int n1 = in.nextInt();
		int n2 = in.nextInt();
		in.close();

		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n2 % n1 == 0) {
			greaDiv = n1;
		} else {
			for (int i = 2; i <= n2; i++) {
				if (n1 % i == 0 && n2 % i == 0) {
					greaDiv = i;
				}
			}
		}

		System.out.format(
				" Najveci zajednicki djelilac za brojeve %d %d je %d.", n1, n2,
				greaDiv);
	}
}
