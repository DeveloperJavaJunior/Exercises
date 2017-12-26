import java.util.*;

public class Task22StringSubstring {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter string s1:");
		String s1 = input.nextLine();

		System.out.print(" Enter string s2:");
		String s2 = input.nextLine();
		input.close();

		if (s1.contains(s2)) {
			System.out.println(s2 + " is substring of " + s1);
		} else {
			System.out.println(s2 + " is not substring of " + s1);
		}

	}

	private static char[] charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
