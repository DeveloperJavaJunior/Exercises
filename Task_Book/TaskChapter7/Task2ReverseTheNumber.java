import java.util.*;

public class Task2ReverseTheNumber {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print(" Enter ten numbers:");
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		for (int i = number.length - 1; i >= 0; i--) {
			System.out.print(number[i] + " ");
		}
		input.close();
	}

}
