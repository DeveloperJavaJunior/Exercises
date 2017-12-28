import java.util.Scanner;


public class Zad03Prosjek {

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// ispis poruke
		System.out.println("Unesite niz brojeva (0 prekida unos): ");
		// novi niz cija je duzina 100
		int[] array = new int[100];
		
		// dodavanje elemenata u niz
		for(int i = 0; i < array.length; i++){
			int num = input.nextInt(); // uzimanje unos od korisnika
			array[i] = num; // dodajemo element u niz
			if(num == 0){ // ako je uneseni broj 0, prekidamo dodavanje elemenata
				break;
			}
		}
		
		// zatvaranje Scannera
		input.close();
		
		// prosjek
		int average = average(array);
		// brojac za brojeve iznad ili jednake prosjeku
		int aboveOrEqual = 0;
		// brojac za brojeve ispod prosjeka
		int below = 0;
		
		// prolazimo sve brojeve u nizu
		for(int num: array){
			// ako je trenutni element 0, dosli smo do kraja unesenih brojeva
			if(num == 0){
				break;
			} else { // ako trenutni element nije nula
				// ako je veci ili jednak prosjeku
				if(num >= average){
					// povecavamo broj brojeva vecih ili jednakih prosjeku
					aboveOrEqual++;
				} else { // ako je manji od prosjeka
					// povecavamo broj brojeva manjih od prosjeka
					below++; 
				}
			}
		}
		// ispis rezultata
		System.out.println("Prosjek: " + average);
		System.out.println("Brojeva iznad ili jednako prosjeku: " + aboveOrEqual);
		System.out.println("Brojeva ispod prosjeka: " + below);
	}
	
	/**
	 * Metoda racuna cjelobrojni prosjek niza cijelih brojeva
	 * @param array niz cijelih brojeva ciji prosjek racunamo
	 * @return  prosjek elemenata niza
	 */
	public static int average(int[] array) {
		int sum = 0;
		int count = 0; // brojac koji cuva broj elemenata u nizu
		
		// prolazimo kroz cijeli niz
		for (int e : array) {
			// dodajemo vrijednosti elemenata na varijablu suma
			sum += e;
			// ako je trenutni element nula, dosli smo do kraja unesenih brojeva u niz
			if(e == 0){
				break;
			}
			// povecavanje broja elemenata
			count++;
		}
		// vracamo prosjek 
		return sum / count;
	}

}
