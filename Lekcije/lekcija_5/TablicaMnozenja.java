package lekcija_5;

public class TablicaMnozenja {

	public static void main(String[] args) {
		
		// ispisati naslov tablice
		System.out.println(" Tablica mnozenja");
		
		// ispisati brojeve u naslovu tablice
		System.out.println("         ");
		for(int j = 1; j <= 9; j++){
			System.out.print("   " + j);
		}
		// ispisati separator izmedu naslova i tijela tablice
		System.out.println("\n------------------------------------------");
		
		// ispisati tijelo tablice
		for(int i = 1; i <= 9; i++){
			System.out.print(i + " | ");
			for(int j = 1; j <= 9; j++){
				// formatirati i ispisati proizvode mnozenja
				System.out.printf("%4d",i * j);
			}
			System.out.println();
		}
	}

}
