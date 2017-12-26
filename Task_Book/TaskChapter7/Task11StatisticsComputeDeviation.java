import java.util.*;

public class Task11StatisticsComputeDeviation {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");

		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println(" The mean is:" + mean(numbers));
		System.out.println(" The standard deviation is:" + deviation(numbers));
	}

	public static double deviation(double[] x) {

		double mean = mean(x);
		double sumSqrt = 0;

		for (int i = 1; i < x.length; i++) {
			sumSqrt += Math.pow((x[i] - mean), 2);
		}
		return Math.sqrt(sumSqrt / (x.length - 1));
	}

	public static double mean(double[] x) {

		double sum = 0;
		for (int i = 1; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;

	}
}
