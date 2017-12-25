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

public class Zadatak_15_Drugi_Nacin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite cijeli broj izmedu 1 i 12:");
		int month = input.nextInt();

		input.close();

		switch (month) {

		case 1:
			System.out.printf(" Izabrani mjesec je: januar ");
			break;
		case 2:
			System.out.printf(" Izabrani mjesec je: februar ");
			break;
		case 3:
			System.out.printf(" Izabrani mjesec je: mart ");
			break;
		case 4:
			System.out.printf(" Izabrani mjesec je: april ");
			break;
		case 5:
			System.out.printf(" Izabrani mjesec je: maj ");
			break;
		case 6:
			System.out.printf(" Izabrani mjesec je: juni ");
			break;
		case 7:
			System.out.printf(" Izabrani mjesec je: juli ");
			break;
		case 8:
			System.out.printf(" Izabrani mjesec je: avgust ");
			break;
		case 9:
			System.out.printf(" Izabrani mjesec je: semptembar ");
			break;
		case 10:
			System.out.printf(" Izabrani mjesec je: oktobar ");
			break;
		case 11:
			System.out.printf(" Izabrani mjesec je: novembar ");
			break;
		case 12:
			System.out.printf(" Izabrani mjesec je: decembar ");
		default:
			System.out.printf(" Pogresan unos,pokusajte ponovo brojevima izmedu 1 12!");
		}

	}
}
