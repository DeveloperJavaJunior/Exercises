import java.util.*;

public class TaskSSN {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print(" Enter a SSN:");
		String ssn = in.nextLine();
		in.close();
		boolean isValid = false;

		for (int i = 0; i < ssn.length(); i++) {
			if ((i == 3 || i == 6) && ssn.charAt(i) == '-') {
				isValid = true;
			}

			else if (i != 3 && i != 6 && Character.isDigit(ssn.charAt(i))) {
				isValid = true;
			} else {
				isValid = false;
				break;
			}
		}

		System.out.println(ssn + " je validan ssn broj " + isValid);
	}
}