package week05;

public class Zadatak07 {
	public static void main(String[] args) {
		int card = (int) (1 + Math.random() * 13);
		int color = (int) (Math.random() * 4);

		if (card == 1) {
			System.out.print("A");
		} else if (card == 11) {
			System.out.print("J");
		} else if (card == 12) {
			System.out.print("Q");
		} else if (card == 13) {
			System.out.print("K");
		} else {
			System.out.print(card);
		}

		System.out.print(" ");

		if (color == 0) {
			System.out.print("srce");
		} else if (color == 1) {
			System.out.print("pik");
		} else if (color == 2) {
			System.out.print("tref");
		} else {
			System.out.print("karo");
		}

	}
}
