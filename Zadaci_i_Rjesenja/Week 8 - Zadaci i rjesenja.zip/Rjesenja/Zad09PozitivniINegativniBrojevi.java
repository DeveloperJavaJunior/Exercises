import java.util.Scanner;

public class Zad09PozitivniINegativniBrojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];// array which will store the numbers
		System.out.println("Enter an array of 10 integers : ");
		// populate array with entered numbers
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		input.close();
		findNumOfPositiveAndNegativeNumbers(array);// print number of negative and positive numbers
		calculateAndPrintSumAndAverage(array);// calculate sum and average and print them

	}

	public static void findNumOfPositiveAndNegativeNumbers(int[] array) {
		int negativesCounter = 0;// the counter of negative numbers
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {// if the number is negative
				negativesCounter++;// increase the counter of negative numbers
			}
		}
		System.out.println("Number of negative numbers in the list: "
				+ negativesCounter);// print num of negatives
		System.out.println("Number of positive numbers int the list: "
				+ (array.length - negativesCounter));// print num of positives

	}

	public static void calculateAndPrintSumAndAverage(int[] array) {
		double sum = 0; // sum
		for (int i = 0; i < array.length; i++) {
			sum += array[i];// adding all numbers in the array to sum
		}

		double average = (sum / array.length); // average

		// printing results
		System.out.println("The sum of numbers is: " + sum);
		System.out.println("The average of numbers is: " + average);
	}

}
