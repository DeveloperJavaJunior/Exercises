import java.util.*;

public class Task1PositiveAndNegative {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an integer,the input ends if it is 0:");

		int countPos = 0;
		int countNeg = 0;

		int n;
		double sum = 0;

		while ((n = input.nextInt()) != 0) {
			sum = sum + n;

			if (n > 0) {
				countPos++;
			} else{
				countNeg++;
			}
		}
		if (countPos + countNeg == 0) {
			System.out.println(" No numbers are entered expect 0 ");
			System.exit(0);
		}
		System.out.println(" The number of positives is " + countPos);
		System.out.println(" The number of negatives is " + countNeg);
		System.out.println(" The total is " + sum);
		System.out.println(" The average is " + (sum / (countPos + countNeg)));

	}

}
