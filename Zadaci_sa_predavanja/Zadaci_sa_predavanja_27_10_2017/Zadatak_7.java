package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji uèitava iznos raèuna koji treba uplatiti kao i procenat tog 
 *  raèuna kojeg želimo platitikao napojnicu te izraèunava ukupan raèun i napojnicu.
 *  Sample run programa:
 *  Unesite iznos racuna u KM: 74
 *  Unesite napojnicu u procentima: 14.5
 *  Iznos napojnice: 10.73 KM
 *  Ukupan iznos racuna: 84.73 KM.
 *  
 */

public class Zadatak_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite iznos racuna u KM:");
		double racun = input.nextDouble();
		
		System.out.print(" Unesite napojnicu u procentima:");
		double procenat = input.nextDouble();
		
		input.close();
		
		double napojnica = racun * (procenat / 100);
		double cijena = racun + napojnica;
		
		System.out.printf(" Iznos napojnice: %.2f KM\n", napojnica);
		System.out.printf(" Ukupan iznos racuna: %.2f KM ", cijena);

	}

}
