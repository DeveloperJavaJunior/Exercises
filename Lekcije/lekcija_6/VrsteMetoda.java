package lekcija_6;

public class VrsteMetoda {
	
	// metoda koja vraca vrijednost
	public static int max(int broj1, int broj2){
		
		int veciBroj;
		
		if(broj1 > broj2){
			veciBroj = broj1;
		}else{
			veciBroj = broj2;
		}
		return veciBroj;
		
	}

	// metoda koja ne vraca vrijednost
	public static void ispisiPoruku(String poruka, int brojIspisivanja){
		
		for(int i = 1; i <= brojIspisivanja; i++){
			System.out.println(i + ", " + poruka);
		}

	}

}

