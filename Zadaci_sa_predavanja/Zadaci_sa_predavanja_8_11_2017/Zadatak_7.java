package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljuæujuæi
 *  i 2 i 1000.Program treba da ispiše 8 brojeva po liniji te razmak izmeðu 
 *  brojeva treba da bude jedan space. Prosti brojevi su brojevi koji su
 *  djeljivi samo sa 1 i samim sobom.
 */

public class Zadatak_7 {

	public static void main(String[] args) {

		int numberPerLine = 0;

		for (int i = 2; i <= 1000; i++) {

			boolean isPrime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 0 && i != 1) {
				System.out.print(i + " ");
				numberPerLine++;
				if (numberPerLine % 8 == 0) {
					System.out.println();

				}

			}
		}
	}
}
