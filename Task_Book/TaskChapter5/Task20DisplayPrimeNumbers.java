public class Task20DisplayPrimeNumbers {

	public static void main(String[] args) {

		for (int i = 2; i < 1_000; i++) {

			if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0)
				i++;
			System.out.println(i);
		}
	}

}
