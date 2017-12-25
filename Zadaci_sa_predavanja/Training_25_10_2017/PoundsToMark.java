package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese neki iznos u funtama.
 *  Nakon što korisnik unese iznos u funtama,program ispisuje isti iznos
 *  u konvertibilnim markama.Uzmimo da je £1 = 2.20 BAM. 
 * 
 */

import java.util.Scanner;

public class PoundsToMark {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print(" Unesite iznos funti koji želite pretvoriti u marke:");

		double funte = unos.nextDouble();

		unos.close();

		double bam = funte * 2.20;

		System.out.printf(" %.2f funti je %.2f maraka ", funte, bam);

	}

}