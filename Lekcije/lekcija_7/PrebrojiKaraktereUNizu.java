package lekcija_7;

public class PrebrojiKaraktereUNizu {
	
	/** Metoda koja kreira niz od 100 karaktera */
	public static char[] kreirajNizkaraktera() {
		
		// deklarisati i kreirati niz karaktera duzine 100
		char[] karakteri = new char[100];
		
		// nasumicno generisati karaktere i dodijeliti ih nizu
		for(int i = 0; i < karakteri.length; i++){
			karakteri[i] = NasumicanKarakter.VratiNasumicnoMaloSlovo();
		}
		// vrati niz
		return karakteri;
	}
	/** Metoda koja ispisuje niz karaktera */
	public static void ispisiNiz(char[] karakteri) {
		// ispisati 25 karaktera po liniji
		for(int i = 0; i < karakteri.length; i++){
			if((i + 1) % 25 == 0){
				System.out.println(karakteri[i]);
			}else{
				System.out.print(karakteri[i] + " ");
			}
		}
		System.out.println();
		
	}


	/** Metoda koja broji ponavljanje svakog karaktera */
	public static int[] prebrojiKaraktere(char[] karakteri) {
		// deklarisati  i kreirati int niz duzine 26
		int[] brojac = new int[26];
		
		// prebroji sva mala slova u nizu
		for(int i = 0; i < karakteri.length; i++){
			brojac[karakteri[i] - 'a']++;

	}
		// vrati niz
		return brojac;

}
	/** metoda koja ispisuje broj ponavljanja karaktera */
public static void ispisiBrojPonavljanjaKaraktera(int[] brojac) {
	
	for(int i = 0; i < brojac.length; i++){
		// ispisati 5 karaktera po liniji
		if((i + 1) % 5 == 0){
			System.out.println((char) (i + 'a') + ": " + brojac[i]);
		}else{
		System.out.print((char) (i + 'a') + ": " + brojac[i] + ", ");
	}}
	
}	
/** Main metoda */
public static void main(String[] args) {
	
	// deklarisati i kreirati niz
	char[] karakteri = kreirajNizkaraktera();
	
	// ispisati niz na konzoli
	System.out.println("100 malih slova su: \n");
	ispisiNiz(karakteri);
	
	// prebrojati ponavljanje svakog karaktera
	int[] brojac = prebrojiKaraktere(karakteri);
	
	// ispisati broj ponavljanja karaktera
	System.out.println("Broj ponavljanja svakog karaktera: \n");
	ispisiBrojPonavljanjaKaraktera(brojac);
}
	
}