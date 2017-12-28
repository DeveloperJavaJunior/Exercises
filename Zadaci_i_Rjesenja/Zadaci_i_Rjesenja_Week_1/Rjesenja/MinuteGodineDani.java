/**
Napisati program koji pita korisnika da unese broj minuta (npr. 1 milijardu) te ispisuje koliko je to u godinama i danima. Zbog jednostavnosti, pretpostavimo da godina ima 365 dana.

Sample run programa: 

Unesite broj minuta:  1000000000
1000000000 minuta je otprilike 1902 godina i 214 dana
 */
package week1;

//importovati Scanner
import java.util.Scanner;

public class MinuteGodineDani {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese broj minuta
		System.out.print("Unesite broj minuta: ");

		// uzeti unos od korisnika i dodijeliti varijabli
		int minute = unos.nextInt();
		
		// zatvoriti Scanner
		unos.close();

		// izracunati broj godina
		int godine = minute / (60 * 24 * 365);

		// izracunati preostale minute
		int preostaleMinute = minute % (60 * 24 * 365);

		// izracunati dane
		int dani = preostaleMinute / (24 * 60);

		// ispisati korisniku rezultat
		System.out.println(minute + " minuta je otprilike " + godine + " godina i " + dani + " dana.");

	}
}
