import java.util.*;

public class Task18PyramidPatternA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of lines:");

		int n = input.nextInt();
		input.close();

		System.out.println("Pattern A");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}

			System.out.println();
		}

	}

}
