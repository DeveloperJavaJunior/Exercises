package week5;

public class Tablice {
	public static void main(String[] args) {

		// for petlja koja se vrti 7 puta
		for (int i = 0; i < 7; i++) {

			if (i < 3) {
				// ASCI uppercase karakteri imaju vrijednosti od 65 za A do 90 za Z
				System.out.print( (char)((int)((Math.random() * 26) + 65)) );
			} 
			else {
				System.out.print( (int)(Math.random() * 9) + 1 );
			}
			
		}
	}
}