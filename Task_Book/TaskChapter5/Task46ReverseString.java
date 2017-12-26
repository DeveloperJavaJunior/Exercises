import java.util.*;

public class Task46ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a string:");

		String s = input.nextLine();
		input.close();

		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		System.out.println(" The reversed string is " + s1);
	}

}
