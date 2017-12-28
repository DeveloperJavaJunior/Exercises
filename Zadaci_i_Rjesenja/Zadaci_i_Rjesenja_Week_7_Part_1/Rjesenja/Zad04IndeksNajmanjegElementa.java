import java.util.Scanner;

public class Zad04IndeksNajmanjegElementa {
	public static int indexOfSmallestElement(int[] array) {
		// postavljamo najmanji element na prvi element niza
		int min = array[0];
		int index = 0;
		// prolazimo sve elemente niza
		for (int i = 0; i < array.length; i++) {
			// ako je element manji od trenutno najmanje vrijednosti,
			// nova najmanja vrijednost je vrijednost tog elementa
			if (array[i] < min) {
				min = array[i];
				index = i;
			}
		}
		// vracanje indeksa najmanje vrijednosti
		return index;
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// ispis poruke
		System.out.println("Unesite niz od 10 brojeva: ");
		// novi niz cija je duzina 10
		int[] array = new int[10];
		// dodavanje elemenata u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		// zatvaranje Scannera
		input.close();
		// ispis rezultata
		System.out.println("Indeks najmanjeg elementa u nizu je: " + indexOfSmallestElement(array));
	}

}
