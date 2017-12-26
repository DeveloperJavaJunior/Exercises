public class Task5ConversionKilograms {

	public static void main(String[] args) {
		final int END = 199;
		final int POUND_START = 20;

		System.out.printf("%-9s%15s", "Kilograms", "Pounds");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n", "Pounds", "Kilograms");

		for (int j = 0, i = 1; i <= END; i += 2, j += 5) {
			System.out.printf("%-9d%15.1f", i, i * 2.2);
			System.out.print("\t|\t");
			System.out.printf("%-9d%15.1f\n", POUND_START + j,
					(POUND_START + j) / 2.2);

		}

	}

}
