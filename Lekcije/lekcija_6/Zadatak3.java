package lekcija_6;

public class Zadatak3 {

	// Odrediti da li je godina prijestupna
	public static boolean isPrestupnaGodina(int godina) {
		return godina % 400 == 0 || (godina % 4 == 0 && godina % 100 != 0);

	}

	public static int brojDanaUGodini(int godina) {

		if (isPrestupnaGodina(godina)) {
			return 366;
		} else {
			return 365;
		}
	}

	public static void main(String[] args) {

		for (int godina = 2000; godina <= 2020; godina++) {
			System.out.println("Godina " + godina + " ima " + brojDanaUGodini(godina) + "dana.");
		}
	}
}
