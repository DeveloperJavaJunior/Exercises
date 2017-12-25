package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispisuje 
 *  koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.
 *  Sample run programa:
 *  Unesite broj minuta:  1000000000
 *  1000000000 minuta je otprilike 1902 godina i 214 dana
 *  
 */

public class Zadatak_6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj minuta:");
		
		int minute = input.nextInt();
		input.close();
		
		int godine = minute / (365 * 24 * 60);
		int dani = minute % (365 * 24 * 60) / (24 * 60);
		

		System.out.printf(" %d minuta je otprilike %d godine i %d dana.", minute,godine, dani);

	}

}