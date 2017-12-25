package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * Napisati program koji izraèunava minimalnu dužinu avionske piste ako nam je data brzina
 * pri uzlijetanju i ubzanje aviona koristeci  se formuloma duzina = v^2 / ( 2 * a)
 * Korisnik treba da unese brzinu(v) u m/s i ubrazanje(a) s^2
 * Sample run programa:
 * Unesite brzinu i ubrzanje aviona:60 3,5
 * Minimalna duzina piste za ovaj avion iznosi: 514.286m 
 *
 */

public class Zadatak_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite brzinu i ubrzanje aviona:");
		
		double brzina = input.nextDouble();
		double ubzanje = input.nextDouble();
		
		input.close();
		
		double duzina = Math.pow(brzina, 2) / (2 * ubzanje);
		
		System.out.printf(" Minimalna duzina piste za ovaj avion iznosi: %.3fm ", duzina);
		
		

	}

}
