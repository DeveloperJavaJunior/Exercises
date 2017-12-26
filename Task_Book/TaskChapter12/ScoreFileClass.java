import java.util.Scanner;
import java.io.*;

public class ScoreFileClass {

	public static void main(String[] args) throws FileNotFoundException {
		ScoreFile score = new ScoreFile();
		Scanner input = new Scanner(System.in);

		System.out.println("Do u want to open this file? \n0 - No\n1 - Yes");
		int option = input.nextInt();
		if (option == 0) {
			System.exit(0);
		}
		
		score.displayScore();

		System.out
				.println("\n\nDo u want display of sum and average? \n0 - No\n1 - Yes");
		option = input.nextInt();
		input.close();
		if (option == 0) {
			System.exit(0);
		}
		score.sumAndAverage();
	}
}
