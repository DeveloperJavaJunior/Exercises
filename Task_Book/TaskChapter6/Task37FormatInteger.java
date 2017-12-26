import java.util.*;

public class Task37FormatInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an interger:");
		int number = input.nextInt();

		System.out.print("Enter the width:");
		int width = input.nextInt();
		input.close();
		System.out.println(format(number, width));
	}

	public static String format(int number, int width) {
		int numberOfDigit = getSize(number);
		String format = String.valueOf(number);

		for (int i = 0; i < width - numberOfDigit; i++) {
			format = "0" + format;
		}
		return format;
	}

	public static int getSize(long d) {

		int numberOfDigit = 1;
		while ((d = d / 10) != 0) {
			numberOfDigit++;
		}
		return numberOfDigit;

	}

}
