/**
Napisati program koji pita korisnika da unese radius i dužinu cilindra te izračunava njegovu površinu i zapreminu koristeći se sljedećim formulama: 

površina = radius * radius * 3.14159
zapremina = površina * dužina

Sample run programa: 

Unesite radius i dužinu cilindra: 5.5 12
Površina cilindra iznosi 95.0331
Zapremina cilindra iznosi 1140.4
*/

package week1;

// importovati Scanner
import java.util.Scanner;

public class RadiusDuzinaCilindra {
	public static void main(String[] args) {

		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese radius i duzinu cilindra
		System.out.print("Unesite radius i duzinu cilindra: ");

		// uzeti unos od korisnika i dodijeli varijablama
		double radius = unos.nextDouble();
		double duzina = unos.nextDouble();

		// zatvoriti Scanner
		unos.close();
		
		// izracunati povrsinu i zapreminu cilindra
		double povrsina = radius * radius * 3.14159;
		double zapremina = povrsina * duzina;

		// ispisati korisniku rezultate
		System.out.println("Povrsina cilindra iznosi " + povrsina);
		System.out.println("Zapremina cilindra iznosi " + zapremina);
	}

}
