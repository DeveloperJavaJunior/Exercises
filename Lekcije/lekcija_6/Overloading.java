package lekcija_6;

public class Overloading {
	
	
	/** Metoda koja vraca veci od 2 cijela broja */
	public static int max(int broj1, int broj2){
		
		if(broj1 > broj2){
			return broj1;
		}else{
			return broj2;
		}
		
	}
	/** Metoda koja vraca veci od 2 broja sa decimalnim zarezom */
	public static double max(double broj1, double broj2){
		
		if(broj1 > broj2){
			return broj1;
		}else{
			return broj2;
		}
		
	}
	/** Metoda koja vraca najveci od 3 cijela broja */
	public static int max(int broj1, int broj2, int broj3){
		return max(max(broj1, broj2), broj3);
		
	}

	/** Main metoda */
	public static void main(String[] args) {
		
		// pozvati metodu sa int parametrima
		System.out.println("Veci broj od dva cijela broja (7 i 77) je: " + max(7, 77));

		// pozvati metodu sa double parametrima
		System.out.println("Veci broj od dva broja sa decimalnim zarezom (7.09 i 7.56) je: " + max(7.9, 7.56));
		
		// pozvati metodu sa tri int parametra
		System.out.println("Najveci od tri cijela broja (6, 9, 13) je: " + max(6, 9, 13));
	}

}
