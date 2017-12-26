import java.util.*;

public class Task10FindTheIndexOfTheSmallestElement {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");
		
		double[] numbers = new double[10];
		 for(int i = 0; i < numbers.length; i++){
			 numbers[i] = input.nextDouble();
		 }
	System.out.println(" The index of minimum number is:" + indexOfSmallestElement(numbers));
	}
	public static int indexOfSmallestElement(double[] array) {
		
		double min = array[0];
		int minIndex = 0;
		
		for(int i = 1; i < array.length; i++){
			if(min > array[i]){
				minIndex = i;
			}
		}
		return minIndex;
	}
	
}
