import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 */

public class PhoneKeyPads {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter a letter: ");

		String s = input.next();

		input.close();

		char ch = s.toLowerCase().charAt(0);

		int n;

		switch (ch) {

		case 'a':
		case 'b':
		case 'c':
			n = 2;
			break;
		case 'd':
		case 'e':
		case 'f':
			n = 3;
			break;
		case 'g':
		case 'h':
		case 'i':
			n = 4;
			break;
		case 'j':
		case 'k':
		case 'l':
			n = 5;
			break;
		case 'm':
		case 'n':
		case 'o':
			n = 6;
			break;
		case 'p':
		case 'q':
		case 'r':
		case 's':
			n = 7;
			break;
		case 't':
		case 'u':
		case 'v':
			n = 8;
			break;
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			n = 9;
			break;

		default:
			n = 0;
			break;
		}
		if (n != 0) {

			System.out.printf(" The corresponding number is %d ", n);

		} else {

			System.out.printf(" %s is a invalid input.",s);
		}

	}
}
