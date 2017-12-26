import java.util.*;

public class Task18PyramidPatternC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of lines:");

		int n = input.nextInt();
		input.close();

		System.out.println("Pattern C");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			System.out.println();
		}
	}

}
