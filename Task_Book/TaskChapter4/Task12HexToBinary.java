import java.util.*;

public class Task12HexToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a hex digit:");

		String hexString = input.nextLine();
		input.close();

		if (hexString.length() != 1) {
			System.exit(1);
		}

		char ch = Character.toUpperCase(hexString.charAt(0));
		int value = 0;

		if (ch <= 'F' && ch >= 'A') {
			value = ch - 'A' + 10;
		} else if (Character.isDigit(ch)) {
			value = ch - '0';
		} else {
			System.out.println(ch + " is invalid input.");
			System.exit(0);
		}

		System.out.println(" The binary value is " + ch
				+ Integer.toBinaryString(value));

	}

}
