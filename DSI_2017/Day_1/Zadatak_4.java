package day_1;

public class Zadatak_4 {

	public static void main(String[] args) {
		int n = 0;

		for (int i = 100; i < 1000; i++) {
			if (i % 5 == 0 && i % 6 == 0) {

				System.out.print(i + " ");
				n++;

				if (n % 10 == 0)
					System.out.println();
			}
		}
	}

}