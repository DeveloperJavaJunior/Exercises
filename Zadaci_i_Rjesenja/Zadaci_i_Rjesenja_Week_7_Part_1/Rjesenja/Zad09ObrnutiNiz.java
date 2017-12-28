import java.util.Scanner;

public class Zad09ObrnutiNiz {

	/**
	 * Metoda smjesta elemente proslijedjenog niza u novi niz, u obrnutom redoslijedu
	 * @param array  niz koji zelimo obrnuti
	 * @return  obrnut niz
	 */
	public static int[] reverse(int[] array) {
		// novi niz cija je duzina jednaka duzini proslijedjenog niza
		int[] result = new int[array.length];
		// petlja prolazi sve elemente proslijedjenog niza, od posljednjeg do prvog, 
		// i smjesta ih u niz result na indekse od 0 do length - 1
		for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
			result[j] = array[i];
		}
		// vracanje obrnutog niza
		return result;
	}

	public static void main(String[] args) {
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// novi niz od 5 elemenata
		int[] niz = new int[10];

		System.out.print("Unesite niz od 10 brojeva: ");
		// unosenje elemenata u niz
		for (int i = 0; i < niz.length; i++) {
			niz[i] = input.nextInt();
		}
		// zatvaranje Scannera
		input.close();
		
		// dobijanje obrnutog niza pozivanjem reverse metode
		int[] obrnutiNiz = reverse(niz);
		// ispis obrnutog niza
		for (int broj : obrnutiNiz) {
			System.out.print(broj + " ");
		}
	}

}
