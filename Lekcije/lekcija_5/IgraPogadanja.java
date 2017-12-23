package lekcija_5;

import java.util.Scanner;

public class IgraPogadanja {

	public static void main(String[] args) {

		int broj = (int) (Math.random() * 10);
		Scanner unos = new Scanner(System.in);

		int odgovor = -1; // bilo koji broj van raspona 0 - 9

		while (odgovor != broj) {

			// pitati korisnika da unese svoj odgovor
			System.out.println("Pokusaj pogoditi broj koji je zamisljen(u rasponu 0 - 10): ");
			odgovor = unos.nextInt();

			// ukoliko je korisnik pogodio odgovor
			if (odgovor == broj) {
				System.out.println("Cestitam, broj koji sam zamislio je " + broj);
			} // ukoliko korisnik unese broj veci od generisanog
			else if (odgovor > broj) {
				System.out.println("Vas odgovor je previsok. Pokusajte ponovo. ");
			} // ukoliko korisnik unese broj manji od generisanog
			else {
				System.out.println("Vas odgovor je prenizak. Pokusajte ponovo. ");

			}
		}

		unos.close();
	}

}
