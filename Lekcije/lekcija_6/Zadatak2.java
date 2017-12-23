package lekcija_6;

public class Zadatak2 {

	public static void main(String[] args) {

		ispisiKaraktere('a', 'z', 13);

	}

	public static void ispisiKaraktere(char k1, char k2, int brojPoLiniji) {

		int brojacKaraktera = 1;

		for (int i = k1; i <= k2; i++) {
			if (brojacKaraktera % brojPoLiniji == 0) {
				System.out.println((char) i);
			} else {
				System.out.println((char) i);

			}
		}

	}
}
