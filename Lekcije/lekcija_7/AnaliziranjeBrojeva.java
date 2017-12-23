package lekcija_7;

public class AnaliziranjeBrojeva {

	public static void main(String[] args) {
		// napraviti novi Scanner objekt
		java.util.Scanner unos = new java.util.Scanner(System.in);

		// pitati korisnika da unese duzinu niza
		System.out.print("Molimo vas unesite broj elemenata: ");
		int broj = unos.nextInt();
		
		// napraviti novi niz
		double[] brojevi = new double[broj];
		double suma = 0;
		
		// pitati korisnika da unese sve brojeve i dodati ih na varijablu suma
		System.out.print("Molimo vas unesite " + brojevi.length + " brojeva: ");
		for(int i = 0; i < brojevi.length; i++){
			brojevi[i] = unos.nextDouble();
			suma += brojevi[i];
		}
		// izracunati prosjek
		double prosjek = suma / broj;
		
		// izbrojiti sve elemente iznad prosjeka
		int iznadProsjeka = 0;
		for(int i = 0; i < broj; i++){
			if(brojevi[i] > prosjek){
				iznadProsjeka++;
			}
		}
		// ispisati korisniku rezultate
		System.out.println("\nProsjek svih unesenih brojeva je " + prosjek);
		System.out.println("Broj elemenata vecih od prosjeka je " + iznadProsjeka);
		
		// zatvoriti Scanner
		unos.close();
	}

}
