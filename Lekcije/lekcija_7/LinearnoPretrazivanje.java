package lekcija_7;

public class LinearnoPretrazivanje {
	
	/** Metoda koja implementira algoritam za linearno pretrazivanje */
	public static int linearno(int[] niz, int kljuc){
		
		for(int i = 0; i < niz.length; i++){
			if(kljuc == niz[i]){
				return i;
			}
		}
		return -1;
		
		
	}

	public static void main(String[] args) {
		
		int[] niz = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println("Element 6 se nalazi na poziciji: " + linearno(niz, 6));
		System.out.println("Element 77 se nalazi na poziciji: " + linearno(niz, 77));

	}

}
