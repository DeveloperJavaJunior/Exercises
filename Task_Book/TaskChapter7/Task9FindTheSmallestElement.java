import java.util.*;

public class Task9FindTheSmallestElement {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");
		
		double[] numbers = new double[10];
		 for(int i = 0; i < numbers.length; i++){
			 numbers[i] = input.nextDouble();
		 }
	System.out.println(" The minimum number is:" + min(numbers));
	}
	public static double min(double[] array) {
		
		double min = array[0];
		
		for(int i = 1; i < array.length; i++){
			if(min > array[i]){
				min = array[i];
			}
		}
		return min;
		
	}

}
