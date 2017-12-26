import java.util.*;

public class Task14GreatestCommonDivisor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two intergers:");

		int n1 = input.nextInt();
		int n2 = input.nextInt();
		input.close();
		
		if (n2 < n1) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}

		for (int d = n1; true; d--) {

			if (n1 % d == 0 && n2 % d == 0) {
				System.out.println("The greatest common divisor is:" + d);
				break;
			}

		}

	}

}
