import java.util.*;

public class Task18BubbleSort {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");

		double[] numbers = new double[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		bubbleSort(numbers);
		System.out.println(" The array sort is:");
		
		for(int i = 0; i < numbers.length; i++){
		System.out.println(numbers[i]);
		}
	}
	public static double bubbleSort(double[] list) {
		
		int n = list.length - 1;
		while(n != 0){
		int i;
			for( i = 0; i < n; i++){
			if(list[i] > list[i+1]){
				double temp = list[i];
				list[i] = list[i+1];
				list[i+1] = temp;
			}
		}
		 n = i-1;
		}
		return n;

	}
	

}
