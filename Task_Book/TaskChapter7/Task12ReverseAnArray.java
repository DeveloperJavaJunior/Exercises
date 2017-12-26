import java.util.*;

public class Task12ReverseAnArray {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		
		int[] reverseNumbers = reverse(numbers);
		System.out.println(" Pringting the orginal array:");
		
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
			
		}
		System.out.println();
		System.out.println(" Pringting the returned array:");
		
		for(int i = 0; i < reverseNumbers.length; i++){
			System.out.print(reverseNumbers[i] + " ");
		}
		}

	public static int[] reverse(int[] list) {
		
		int temp;
	
		for(int i = 0, j = list.length - 1; i < list.length / 2; i++, j--){
			temp = list[j];
			list[j] = list[i];
			list[i] = temp;
		}
		return list;
	
	}

}
