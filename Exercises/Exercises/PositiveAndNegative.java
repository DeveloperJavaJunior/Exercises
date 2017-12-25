public class PositiveAndNegative {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter an integer,the input ends if it is 0:");

		int countPos = 0;
		int countNeg = 0;

		double sum = 0;
		
		for (int n ; (n = in.nextInt()) != 0 ;) {
			sum += n;
			if (n > 0) {
				countPos++;
			} else {
				countNeg++;

			}
		}

		System.out.format(" The number of positives is %d \n",countPos);
		System.out.format(" The number of negatives is %d \n" ,countNeg);
		System.out.format(" The total is %.2f \n",sum);
		System.out.format(" The average is %.2f ",sum / (countPos + countNeg));

	}

}
