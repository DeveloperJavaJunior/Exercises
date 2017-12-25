package training_10_11_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati metodu koja vraæa broj dana u godini. 
 *  public static int brojDanaUGodini(int godina)
 *  Poziv brojDanaUGodini(2000) vraæa 366.
 */

public class NumberDaysInYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite godinu za koju zelite zna broj dana: ");
		int year = input.nextInt();

		input.close();
		
		System.out.printf(" %d godina ima %d dana.", year, numberDaysInYear(year));

	}

	public static int numberDaysInYear(int year) {
		
	
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {

			return 366;

		} else {

			return 365;
		}

	}
}
