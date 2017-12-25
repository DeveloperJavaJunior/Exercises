import java.awt.event.InputEvent;


public class Test {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		
		System.out.print("Unesite iznos racuna u KM: ");
		double racun = in.nextDouble();
		System.out.print("Unesite napojnicu u procentima: ");
		double napojnica = in.nextDouble();
		in.close();	
		
		double iznosNapojnice = racun * napojnica / 100;
		double ukupanRacun = racun + iznosNapojnice;
		
		System.out.printf("Iznos napojnice: %.2f.\nUkupan iznos racuna: %.2f ", iznosNapojnice, ukupanRacun);

	}

}
