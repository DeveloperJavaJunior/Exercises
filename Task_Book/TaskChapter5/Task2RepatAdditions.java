import java.util.*;

public class Task2RepatAdditions {

	private static int fullTime;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMBERS_OF_QUESTIONS = 10;

		int correctCount = 0;
		int count = 0;

		long startTime = System.currentTimeMillis();
		String output = "";

		while (count < NUMBERS_OF_QUESTIONS) {
			int number1 = (int) (Math.random() * 16);
			int number2 = (int) (Math.random() * 16);

			int answer = input.nextInt();
			

			if (number1 + number2 == answer) {
				System.out.println(" Your answer is correct ");
				correctCount++;
			} else {
				System.out.println(" Your answer is wrong ");
				count++;
				output += "\n" + number1 + " " + number2 + " = " + answer + (number1 + number2 == answer) != null? " correct" : " wrong ";
			}
			long endTime = System.currentTimeMillis();
			long fullTime = endTime - startTime;
		}

		System.out.println(" Correct count is " + correctCount + " Full time is " + fullTime / 1000);
	}

}
