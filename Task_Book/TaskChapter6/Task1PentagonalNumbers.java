public class Task1PentagonalNumbers {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.printf("%8d",getPentagonalNumbers(i));
			if (i % 10 == 0) {
				System.out.println("");
			}

		}

	}

	public static int getPentagonalNumbers(int n) {
	
		return n * (3 * n - 1) / 2;
	}

}
