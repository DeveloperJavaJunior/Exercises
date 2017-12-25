package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji trazi od korisnika da unese cijeli broj izmedju 1 i 12 i ispisuje ime
 *  mjeseca na osnovu broja. (1 - januar, 2 - februar, ... , 12 - decembar )
 *  Sample run programa:
 *  Unesite cijeli broj izmedju 1 i 12: 4
 *  Izabrani mjesec je: april
 *
 */

public class Zadatak_15_Prvi_Nacin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite cijeli broj izmedu 1 i 12:");
		int month = input.nextInt();

		input.close();
		
		if (month == 1) {
			System.out.printf(" Izabrani mjesec je: januar ");
		} else if (month == 2) {
			System.out.printf(" Izabrani mjesec je: februar ");
		} else if (month == 3) {
			System.out.printf(" Izabrani mjesec je: mart ");
		} else if (month == 4) {
			System.out.printf(" Izabrani mjesec je: april ");
		} else if (month == 5) {
			System.out.printf(" Izabrani mjesec je: maj ");
		} else if (month == 6) {
			System.out.printf(" Izabrani mjesec je: juni ");
		} else if (month == 7) {
			System.out.printf(" Izabrani mjesec je: juli ");
		} else if (month == 8) {
			System.out.printf(" Izabrani mjesec je: avgust ");
		} else if (month == 9) {
			System.out.printf(" Izabrani mjesec je: semptembar ");
		} else if (month == 10) {
			System.out.printf(" Izabrani mjesec je: oktobar ");
		} else if (month == 11) {
			System.out.printf(" Izabrani mjesec je: novembar ");
		} else if (month == 12) {
			System.out.printf(" Izabrani mjesec je: decembar ");
		} else{
			System.out.printf(" Pogresan unos,pokusajte ponovo brojevima izmedu 1 12!");
			
		}

	}

}
