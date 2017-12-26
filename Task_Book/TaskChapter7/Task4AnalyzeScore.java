import java.util.*;

public class Task4AnalyzeScore {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter scores,end input with negative number:");

		final int MAX_NUMBER_OF_SCORE;
		int[] score = new int[100];
		int sum = 0, avg = 0, n = 0;

		for (int i = 0; i < score.length; i++) {
			score[i] = input.nextInt();

			if (score[i] > 0) {
				avg = sum / i;
				break;
			} else {
				sum += score[i];
				n++;
			}
		}
		int equal = 0, above = 0, below = 0;
		for (int i = 0; i < n; i++) {
			if (score[i] == avg) {
				equal++;
			} else if (score[i] > avg) {
				above++;
			} else {
				below++;
			}
		}
		System.out.println(" The number scores equal to average is:" + equal);
		System.out.println(" The number scores above to average is:" + equal);
		System.out.println(" The number scores below to average is:" + equal);
	}

}
