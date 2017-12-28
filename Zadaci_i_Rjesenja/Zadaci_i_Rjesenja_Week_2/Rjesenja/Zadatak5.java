package zadaci;

import java.util.Scanner;

/**
 * Napisati program koji traži od korisnika da unese cijeli broj i odredjuje da
 * li je uneseni broj djeljiv i sa 5 i sa 6, da li je djeljiv sa 5 ili sa 6 i da
 * li je djeljiv sa 5 ili 6, ali ne sa oba. 
 * Sample run programa: 
 * Unesite cijeli broj: 10 
 * Da li je broj djeljiv sa 5 i sa 6? false 
 * Da li je broj djeljiv sa 5 ili sa 6? true 
 * Da li je broj djeljiv sa 5 ili sa 6, ali ne sa oba? true
 */
public class Zadatak5 {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// reci korisniku da unese cijeli broj
		System.out.print("Unesite cijeli broj: ");

		// uzeti unos od korisnika
		int broj = unos.nextInt();

		// zatvoriti Scanner
		unos.close();

		// ispis poruke
		System.out.print("Da li je broj djeljiv sa 5 i sa 6? ");
		// ispis rezultata provjere da li je broj djeljiv sa 5 i sa 6
		System.out.println(broj % 5 == 0 && broj % 6 == 0);

		// ispis poruke
		System.out.print("Da li je broj djeljiv sa 5 ili sa 6? ");
		// ispis rezultata provjere da li je broj djeljiv sa 5 ili sa 6
		System.out.println(broj % 5 == 0 || broj % 6 == 0);

		// ispis poruke
		System.out.print("Da li je broj djeljiv sa 5 ili sa 6 ali ne sa oba? ");
		// ispis rezultata provjere da li je broj djeljiv sa 5 ili sa 6, ali ne
		// sa oba
		System.out.println(broj % 5 == 0 ^ broj % 6 == 0);
	}
}
