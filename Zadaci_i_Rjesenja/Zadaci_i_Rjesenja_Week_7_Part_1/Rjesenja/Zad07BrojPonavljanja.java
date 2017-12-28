import java.util.Scanner;

public class Zad07BrojPonavljanja {

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// ispis poruke
		System.out.println("Unesite niz od 10 brojeva: ");
		// novi niz cija je duzina 10
		int[] array = new int[10];
		// niz koji ce nam sluziti za brojanje koliko je puta neki broj unesen
		int[] counter = new int[100];
		// dodavanje elemenata u niz
		for (int i = 0; i < array.length; i++) {
			int num = input.nextInt();
			array[i] = num;
			counter[num]++;
		}
		// zatvaranje Scannera
		input.close();
		
		// ispis rezultata
		for (int i = 0; i < counter.length; i++) {
			// ispisujemo samo brojeve koji su se pojavili
			if (counter[i] != 0) {
				// ternarni operator nam ispisuje "put" ako se broj pojavio samo jednom, 
				// odnosno "puta" ako se pojavio vise od jednom
				System.out.println("Broj " + i + " se pojavljuje " + counter[i]
						+ (counter[i] == 1 ? " put." : " puta."));
			}
		}
	}

}
