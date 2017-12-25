package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Body Mass Index (BMI) je mjera zdravlja na osnovu težine. (diskreditirana ali dobra za potrebe zadatka)
 *  BMI možemo izraèunati tako što uzmemo težinu u kilogramima i podijelimo istu sa kvadratom visine u metrima.
 *  Napisati program koji pita korisnika da unese svoju tezinu u kilogramima i visinu u metrima te ispise 
 *  korisniku njegov BMI.
 *  Sample run programa:
 *  Unesite svoju tezinu u kg (npr. 63): 75
 *  Unesite svoju visinu u metrima (npr 1.63): 1.82
 *  Vas BMI iznosi: 22.6421929718633
 *
 */

public class Zadatak_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite svoju tezinu u kg:");
		double tezina = input.nextDouble();
		
		System.out.print(" Unesite svoju visinu u metrima:");
		double visina = input.nextDouble();
		
		input.close();
		
		double bmi = tezina / Math.pow(visina, 2);
		
		System.out.printf(" Vas BMI iznosi:%.13f", bmi);

	}

}
