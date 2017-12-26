import java.util.*;

public class Task13RandomNumberChooser {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter ten numbers:");

		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(" List of 100 random numbers:");
		for (int i = 0; i < 100; i++) {
			System.out.println(getRandom(numbers));
		}
	}

	public static int getRandom(int... numbers) {

		int getRandom = 0;
		boolean flag = true;

		while (flag) {
			getRandom = intRandom(1, 54);
			flag = false;

			for (int i : numbers) {
				if (getRandom == i) {
					flag = true;
					break;
				}
			}
		}
		return getRandom;
	}
	public static int intRandom(int lowerBound, int upperBound) {
		return (int)(lowerBound + Math.random() * (upperBound - lowerBound + 1));
	}

}
