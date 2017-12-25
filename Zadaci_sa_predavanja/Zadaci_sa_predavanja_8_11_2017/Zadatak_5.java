package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Pretpostavimo da školarina za godinu dana na fakultetu košta 10.000 i da se poveæava
 *  za 5% svake godine. Godinu dana od danas, školarina æe iznositi 10.500.Napisati program
 *  koji izraèunava koliko æe školarina za godinu dana iznositi kroz 10 godina.
 */

public class Zadatak_5 {

	public static void main(String[] args) {

		double schoolFee = 10000;
		double numberYears = 10;
		double rate = 0.05;

		for (int i = 1; i <= numberYears; i++) {

			schoolFee += schoolFee * rate;
		}

		System.out.printf(" Skolarina nakon %.0f godina inosi %.2f ", numberYears, schoolFee);
	}

}
