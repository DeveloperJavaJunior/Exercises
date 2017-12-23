package lekcija_6;

public class PoziviMetoda {

	public static void main(String[] args) {
		// poziv metode koja ne vraca vrijednost
		VrsteMetoda.ispisiPoruku("Beetlejuice", 3);
		
		// poziv metode koja vraca vrijednost
		int veciBroj = VrsteMetoda.max(5, 7);
		System.out.println("\nVeci od dva broja je: " + veciBroj);

	}

}