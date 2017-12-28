import java.util.Scanner;

public class Zad09PolovinaPiramide {
	/**
	 * Metoda ispisuje zadati sablon(lijevu stranu piramide) za odredjeni broj
	 * @param n  broj koji odredjuje visinu piramide i sadrzaj piramide
	 */
	public static void displayPattern(int n) {
		// vanjska petlja se vrti sve brojeve od 1 do broja n
		for (int i = 1; i <= n; i++) {
			// petlja za  ispis razmaka u liniji, prije ispisivanja brojeva
			for (int j = n; j >= i; j--) {
				System.out.print("  ");
			}
			// petlja za ispis brojeva u liniji
			for (int k = i; k >= 1; k--) {
				System.out.print(k + " ");
			}
			// prelazak u novi red
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		// uzimanje unosa od korisnika
		int num = input.nextInt();
		input.close();
		// pozivanje metode za ispisivanje sablona za unijeti broj
		displayPattern(num);
	}

}
