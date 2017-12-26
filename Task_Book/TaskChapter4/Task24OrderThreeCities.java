import java.util.*;

public class Task24OrderThreeCities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter name a first city:");
		String s1 = input.nextLine();

		System.out.print(" Enter name a second city:");
		String s2 = input.nextLine();

		System.out.print(" Enter name a third city:");
		String s3 = input.nextLine();

		input.close();

		if (s1.compareTo(s2) < 0 && s1.compareTo(s3) < 0)
			System.out.println(" The three cities in alphabetical order are:"
					+ s1 + " " + s2 + " " + s3);

		else if (s2.compareTo(s1) < 0 && s2.compareTo(s3) < 0) {
			System.out.println(" The three cities in alphabetical order are:"
					+ s2 + " " + s1 + " " + s3);

		} else if (s3.compareTo(s1) < 0 && s3.compareTo(s2) < 0) {

			System.out.println(" The three cities in alphabetical order are:"
					+ s3 + " " + s1 + " " + s2);
		} else {

			System.out.println(" The three cities in alphabetical order are:"
					+ s3 + " " + s2 + " " + s1);

		}

	}

}
