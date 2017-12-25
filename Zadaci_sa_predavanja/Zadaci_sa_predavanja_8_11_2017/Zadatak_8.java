package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Pozitivni cijeli broj je savr�en broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca,
 *  isklju�uju�i sebe. Na primjer, 6 je prvi savr�eni broj jer 6 = 3 + 2 + 1. Sljede�i savr�eni broj je 28
 *  jer 28 = 14 + 7 + 4 + 2 + 1. Samo 4 savr�ena broja postoje u rasponu od 0 do 10.000. Napi�ite
 *  program koji ispisuje sva 4.
 */

public class Zadatak_8 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}

			}
			if (sum == i) {
				System.out.println(i + " je savrseni broj.");

			}
			sum = 0;
		}
		System.out.println();
	}

}
