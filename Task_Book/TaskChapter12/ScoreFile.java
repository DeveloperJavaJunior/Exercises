import java.util.Scanner;
import java.io.*;

public class ScoreFile {
	int sum;
	double countAverage;

	public ScoreFile() {
	}

	public void displayScore() throws FileNotFoundException {
		Scanner input = new Scanner(new File("D:\\scores.txt"));
		while (input.hasNext()) {
			int score = input.nextInt();
			sum += score;
			countAverage++;
			System.out.print(score + " ");
		}
		input.close();
	}

	public void sumAndAverage() {
		double average = sum / countAverage;
		System.out.print("Score sum: " + sum + "\tScore average: " + average);
	}
}
