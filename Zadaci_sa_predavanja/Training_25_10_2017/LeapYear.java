package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese godinu. Nakon što korisnik 
 *  unese godinu, program provjerava da li je unijeta godina prestupna te ispisuje
 *   korisniku da li je godina prestupna.Godina je prestupna ukoliko je djeljiva 
 *   sa 4 ali ne sa 100 ili ako je djeljiva sa 400.
 *
 */

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print(" Unesite godinu:");
		int year = unos.nextInt();
		
		unos.close();
		
		if(year % 4 == 0 || (year % 100 != 0 && year % 400 == 0)){
			System.out.printf(" Godina je prestupna.");
		}else{
		System.out.printf(" Godina nije prestupna.");
		}
	}

}
