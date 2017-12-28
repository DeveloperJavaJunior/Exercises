/**
 Body Mass Index (BMI) je mjera zdravlja na osnovu težine. (diskreditirana ali dobra za potrebe zadatka) 
 BMI možemo izračunati tako što uzmemo težinu u kilogramima i podijelimo istu sa kvadratom visine u metrima. 
 
 Napisati program koji pita korisnika da unese svoju tezinu u kilogramima i visinu u metrima te ispise korisniku njegov BMI. 
 */
package week1;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese svoju tezinu u kilgramima
		System.out.print("Unesite svoju tezinu u kg (npr. 63): ");

		// dodijeliti korisnikov unos varijabli
		int tezina = unos.nextInt();

		// pitati korisnika da unese svoju visinu u metrima
		System.out.print("Unesite svoju visinu u metrima (npr 1.63): ");

		// dodijeliti korisnikov unos varijabli
		double visina = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();

		// izracunati BMI
		double BMI = tezina / (visina * visina);

		// ispisati korisniku rezultat
		System.out.println("Vas BMI iznos : " + BMI);

	}
}
