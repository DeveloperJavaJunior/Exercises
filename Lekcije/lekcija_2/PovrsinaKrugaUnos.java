package lekcija_2;

//importovati Scanner
import java.util.Scanner;

public class PovrsinaKrugaUnos {

	public static void main(String[] args) {
		// deklarisati varijable
		double povrsina;
		double poluprecnik;
		
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);
				
		// pitati korisnika da unese vrijednost poluprecnika
		System.out.print("Unesite vrijednost poluprecnika: ");
		
		// dodijeliti korisnikov unos varijabli poluprecnik
		poluprecnik = unos.nextDouble();
		
		// izracunati povrsinu
		povrsina = poluprecnik * poluprecnik * 3.14159;
		
		
		// ispisi rezultat korisniku
		System.out.println("Povrsina kruga poluprecnika " + poluprecnik + " iznosi " + povrsina);
		
		// zatvoriti Scanner
		unos.close();
		

		
		

	}

}
