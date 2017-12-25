package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji ispisuje sve moguæe kombinacije za biranje dva broja u rasponu od 1 do 7.
 *  Takoðer, program ispisuje broj svih moguæih kombinacija. Dakle, program treba da ispiše sve
 *  moguæe parove brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj moguæih kombinacija je 21.
 */

public class Zadatak_9 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				if (i != j) {
					System.out.print(i + " " + j);
					
				}
				System.out.print("  ");
			}
		}

	}

}
