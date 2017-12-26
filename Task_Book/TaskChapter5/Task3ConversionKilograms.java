public class Task3ConversionKilograms {

	public static void main(String[] args) {

		System.out.printf("%9s%15s\n", "Kilograms", "Pounds");

		for (int i = 1; i <= 199; i += 2) {
			System.out.printf("%-9d%15.1f\n", i, i * 2.2);

		}

	}
}
