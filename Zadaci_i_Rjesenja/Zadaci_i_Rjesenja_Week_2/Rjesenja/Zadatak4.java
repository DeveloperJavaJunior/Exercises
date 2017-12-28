package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji trazi od korisnika da unese cijeli broj izmedju 1 i 12 
 * i ispisuje ime mjeseca na osnovu broja. (1 - januar, 2 - februar, ... , 12 - decembar ) 
 * Sample run programa: 
 * Unesite cijeli broj izmedju 1 i 12: 4
 * Izabrani mjesec je: april
 */
public class Zadatak4 {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj mjeseca
		System.out.print("Unesite cijeli broj izmedju 1 i 12: ");

		// uzeti unos od korisnika
		int brojMjeseca = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// ispisati dio poruke
		System.out.print("Izabrani mjesec je ");

		// na osnovu broja mjeseca ispisati njegov naziv,
		// za nepostojeci broj mjeseca ispisati da mjesec ne postoji
		switch (brojMjeseca) {
		case 1:
			System.out.print("januar");
			break;
		case 2:
			System.out.print("februar");
			break;
		case 3:
			System.out.print("mart");
			break;
		case 4:
			System.out.print("april");
			break;
		case 5:
			System.out.print("maj");
			break;
		case 6:
			System.out.print("jun");
			break;
		case 7:
			System.out.print("jul");
			break;
		case 8:
			System.out.print("avgust");
			break;
		case 9:
			System.out.print("septembar");
			break;
		case 10:
			System.out.print("oktobar");
			break;
		case 11:
			System.out.print("novembar");
			break;
		case 12:
			System.out.print("decembar");
			break;
		default:
			System.out.println("nepostojeci");

		}
	}
}
