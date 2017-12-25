import java.util.*;

public class NajmanjiNajveciDjelilac {

	// Najmanji zajednièki djelilac za dva broja je uvijek 1
	public static int djelioci(int a, int b) {
		int djelilac = 1;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0)
				djelilac = i;
		}
		return djelilac;
	}

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unijeti dva cijela broja");
		int b1 = unos.nextInt();
		int b2 = unos.nextInt();
		System.out.printf("Najmanji zajednièki djelilac za brojeve %d i %d je 1.\n", b1, b2);
		System.out.printf("Najveæi zajednièki djelilac za brojeve %d i %d je %d", b1, b2, djelioci(b1, b2));
	}
}
