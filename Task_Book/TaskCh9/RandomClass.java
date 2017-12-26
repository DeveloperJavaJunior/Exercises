import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {

		int randomNumbers = 50;

		Random random = new Random();

		for (int i = 0; i < randomNumbers; i++) {

			int randomInt = random.nextInt(100);

			System.out.println(" " + randomInt);
		}

	}

}