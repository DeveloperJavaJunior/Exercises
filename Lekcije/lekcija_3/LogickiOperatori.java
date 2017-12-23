package lekcija_3;

//importovati Scanner
import java.util.Scanner;

public class LogickiOperatori {

	public static void main(String[] args) {
		
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);
		
		// pitati korisnika da unese broj, dodijeliti ga varijabli
		System.out.print("molimo vas unesite cijeli broj: ");
		int broj = unos.nextInt();
		
		// provjeriti da li je broj djeljiv sa 2 i 3
		if(broj % 2 == 0 && broj % 3 == 0){
			System.out.println("Broj " + broj + " je djeljiv i sa 2 i sa 3.");
		}
		// provjeriti da li je broj djeljiv sa 2 ili 3
		if(broj % 2 == 0 || broj % 3 == 0){
			System.out.println("Broj " + broj + " je djeljiv sa 2 ili sa 3.");
		}
		// provjeriti da li je broj djeljiv sa 2 ili sa 3 ali ne oba
		if(broj % 2 == 0 ^ broj % 3 == 0){
			System.out.println("Broj " + broj + " je djeljiv sa 2 ili sa 3 ali ne oba broja.");
		}
		
		// zatvoriti Scanner
		unos.close();

	}

}
