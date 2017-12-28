import java.util.Scanner;

public class Zad07Kvadrat {
	/**
	 * Metoda racuna obim kvadrata po formuli: O = 4a
	 * @param stranica  duzina stranice kvadrata (a)
	 * @return  iznos obima kvadrata
	 */
	public static double obim(double stranica) {
		return 4 * stranica;
	}

	/**
	 * Metoda racuna povrsinu kvadrata po formuli: P = a^2 ili P = a * a
	 * @param stranica  duzina stranice kvadrata (a)
	 * @return  iznos povrsine kvadrata
	 */
	public static double povrsina(double stranica) {
		return Math.pow(stranica, 2);
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesite stranicu kvadrata: ");
		// uzimanje duzine stranice od korisnika
		double a = unos.nextDouble();
		unos.close();
		// ispis obima kvadrata pozivanjem metode za racunanje obima
		System.out.println("Obim kvadrata stranice " + a + " cm iznosi: "
				+ obim(a) + " cm.");
		// ispis povrsine kvadrata pozivanjem metode za racunanje povrsine
		System.out.println("Povrsina kvadrata stranice " + a + " cm iznosi: "
				+ povrsina(a) + " cm^2.");
	}

}
