package zadaci;

import java.util.Scanner;

public class Zadatak2 {
	public static void main(String[] args) {
		
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);
		
		// pitati korisnika da unese dva cijela broja
		System.out.print("Unesite dva cijela broja: ");
		
		// uzeti unose od korisnika i dodijeliti varijablama
		int prviBroj = unos.nextInt();
		int drugiBroj = unos.nextInt();
		
		// zatvoriti Scanner
		unos.close();
		
		// provjeriti jesu li oba broja veca od nule, ako jesu onda su pozitivni
		if(prviBroj >= 0 && drugiBroj >= 0) {
			System.out.println("Oba broja su pozitivna.");
		} else {
			System.out.println("Oba broja NISU pozitivna.");
		}
	}
}
