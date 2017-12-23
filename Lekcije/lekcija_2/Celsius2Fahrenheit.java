package lekcija_2;

// importovati Scanner
import java.util.Scanner;

public class Celsius2Fahrenheit {

	public static void main(String[] args) {

		// deklarisati varijable
		double celsius, fahrenheit;

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese temperaturu u C
		System.out.print("Unesite temperaturu u C: ");

		// dodijeliti korisnikov unos varijabli
		celsius = unos.nextDouble();
		
		// izracunati temperaturu u F
		fahrenheit = (9.0 / 5) * celsius + 32;
		
		// ispisi rezultat korisniku
		System.out.println(celsius + " Celsijusa je " + fahrenheit + " Fahrenheata.");
		
		// zatvoriti Scanner
		unos.close();

	}

}
