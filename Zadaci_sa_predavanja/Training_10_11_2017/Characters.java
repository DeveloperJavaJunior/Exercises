package training_10_11_2017;

/*
 *  @author Edin Korkic
 *  
 *  Napisati metodu koja ispisuje individualne karaktere u datom rasponu:
 *  public static void ispisiKaraktere(char k1, char k2, int brojPoLiniji)
 *  Metoda ispisuje sve karaktere u nizu izmeðu k1 i k2 s tim da treæi argument 
 *  odreðuje koliko karaktera treba ispisati po liniji.
 */

public class Characters {

	public static void main(String[] args) {

		printCharacter('A', 'Z', 13);

	}

	public static void printCharacter(char ch1, char ch2, int numberPerLine) {

		int count = 0;

		for (int i = ch1; i <= ch2; i++) {
			System.out.print((char) i + " ");
			count++;
			if (count % numberPerLine == 0) {
				System.out.println();

			}
		}
	}

}
