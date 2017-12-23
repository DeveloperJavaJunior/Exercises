package lekcija_3;

//importovati Scanner
import java.util.Scanner;

public class PrestupnaGodina {

	public static void main(String[] args) {
		
		// napraviti novi Scanner
		Scanner unos = new Scanner(System.in);

		// pitati korisnika da unese godinu, dodijeliti istu varijabli
		System.out.print("Molimo unesite godinu za koju zelite znati da li je prestupna: ");
		int godina = unos.nextInt();
		
		// provjeriti da li je godina prestupna
		boolean prestupna = (godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
		
		// ispisati korisniku rezultat
		if(prestupna){
			System.out.println("Godina " + godina + " je prestupna.");
		}else{
			System.out.println("Godina " + godina + " nije prestupna.");
			
		}
		
		// zatvoriti Scanner
		unos.close();
	}

}
