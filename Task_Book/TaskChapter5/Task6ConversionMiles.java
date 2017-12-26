public class Task6ConversionMiles {

	public static void main(String[] args) {
		final int END = 10;
		final int KILOMETERS_START = 20;

		System.out.printf("%-9s%15s", "Miles", "Kilometers");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n", "Kilometers", "Miles");

		for (int j = 0, i = 1; i <= END; i += 1, j += 5) {
			System.out.printf("%-9d%15.1f", i, i * 1.609);
			System.out.print("\t|\t");
			System.out.printf("%-9d%15.1f\n",KILOMETERS_START + j,
					(KILOMETERS_START + j) / 1.609);
		}
	}

}
