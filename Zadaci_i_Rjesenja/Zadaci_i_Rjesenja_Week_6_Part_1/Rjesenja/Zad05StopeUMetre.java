import java.util.Scanner;

public class Zad05StopeUMetre {

	/**
	 * Metoda pretvara stope u metre
	 * 
	 * @param foot
	 *            iznos u stopama
	 * @return iznos u metrima
	 */
	public static double footToMeter(double foot) {
		return foot * 0.305;
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj stopa: ");
		// uzimanje unosa od korisnika
		double foot = input.nextDouble();
		input.close();
		// ispis rezultata
		System.out.println(foot + " stopa iznosi " + footToMeter(foot)
				+ " metara.");
	}

}
