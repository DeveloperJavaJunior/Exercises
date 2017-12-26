import java.util.*;

public class Task5PrintDistinctNumbersSecondMethod {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");

		int[] numbers = new int[10];
		int i = 0; int j = 0; int k = 0;

		while (k < 10) {
			int number = input.nextInt();
			k++;
			for (j = 0; j <= i; j++) {
				if (number == numbers[j]) {
					break;
				}
			}
			if (j - i == 1) {
				numbers[i] = number;
				i++;
			}
		}
		System.out.println(" The distinct number is:" + i);
		System.out.println(" The distinct numbers are:");

		for (int j2 = 0; j2 < i; j2++) {
			System.out.print(numbers[j2] + " ");
		}
	}

}
