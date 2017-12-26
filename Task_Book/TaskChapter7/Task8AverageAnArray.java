import java.util.*;

public class Task8AverageAnArray {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten  double point numbers:");
		
		double[] numbers = new double[10];
		 for(int i = 0; i < numbers.length; i++){
			 numbers[i] = input.nextDouble();
		 }
		 System.out.println(" The average is:" + average(numbers));
	}
	public static int average(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		}
		return sum / array.length;
	}
	public static double average(double[] array) {
		double sum = 0;
		for(int i = 0; i < array.length; i++){
			sum += array[i];
		
	}
		return sum / array.length;
}
}