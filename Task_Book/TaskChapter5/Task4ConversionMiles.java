public class Task4ConversionMiles {

	public static void main(String[] args) {

		System.out.printf("%9s%15s\n","Miles","Kilometers");

		for (int i = 1; i <= 10; i ++) {
			System.out.printf("%-9d%15.1f\n", i, i * 1.609);

		}
	}

}
