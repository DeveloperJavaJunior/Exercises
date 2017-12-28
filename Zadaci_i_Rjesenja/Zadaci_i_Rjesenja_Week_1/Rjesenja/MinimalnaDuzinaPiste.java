/**
Napisati program koji izračunava minimalnu dužinu avionske piste ako nam je data brzina pri uzletanju i ubrzanje aviona.
koristeći se formulom: duzina = v^2 / (2 * a) 

Korisnik treba da unese brzinu(v) u m/s i ubrazanje(a) u m/s^2.

Sample run programa:

Unesite brzinu i ubrzanje: 60 3.5
Minimalna duzina piste za ovaj avion iznosi: 514.286 m

*/

package week1;

//importovati Scanner
import java.util.Scanner;

public class MinimalnaDuzinaPiste {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese brzinu i ubrzanje
		System.out.print("Unesite brzinu i ubrzanje: ");
		
		// uzeti unos od korisnika i dodijeliti ga varijablama
		int brzina = unos.nextInt();
		double ubrzanje = unos.nextDouble();
		
		// zatvoriti Scanner
		unos.close();
		
		// izracunati duzinu piste
		double duzina = (brzina * brzina) / (2 * ubrzanje);
		
		//ispisati korisniku rezultat
		System.out.println("Minimalna duzina piste za ovaj avion iznosi: " + duzina + " m");
	}

}
