package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 *  
 *  1.ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva: 
 *  d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao checksum
 *   i njega izraèunavamo iz prvih devet brojeva koristeæi se sljedeæom formulom:
 *   (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. 
 *   Ukoliko je checksum 10, zadnji broj oznaèavamo sa X u skladu sa ISBN-10 konvencijom. 
 *   Napisati program koji pita korisnika da unese prvih 9 brojeva te ispiše desetocifreni
 *    ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam 
 *    ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9 brojeva, 
 *    program nam ispisuje 013031997X kao ISBN-10 broj)
 *  
 */

import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner unos =  new Scanner(System.in);
		System.out.print(" Unesite devet cijelih brojeva:");
		
		int d1 = unos.nextInt();
		int d2 = unos.nextInt();
		int d3 = unos.nextInt();
		int d4 = unos.nextInt();
		int d5 = unos.nextInt();
		int d6 = unos.nextInt();
		int d7 = unos.nextInt();
		int d8 = unos.nextInt();
		int d9 = unos.nextInt();
		
		unos.close();
		
		int d = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if(d == 10){
			System.out.printf(" %d%d%d%d%d%d%d%d%dX ",d1, d2, d3, d4, d5, d6, d7, d8, d9);
		}else{
			System.out.printf(" %d%d%d%d%d%d%d%d%d1 ",d1 , d2, d3, d4, d5, d6, d7, d8, d9);
		}
		

	}

}
