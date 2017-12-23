package day_2;

public class Zadatak_6 {

	public static void main(String[] args) {

		printChars('A', 'Z', 13);

	}

	public static void printChars(char ch1, char ch2, int numPerLine) {

		int perLine = 0;

		for (char i = ch1; i <= ch2; i++) {
			System.out.print(i + " ");	
			perLine++;
			if (perLine % numPerLine == 0) {
				System.out.println();
			}

		}

	}

}
