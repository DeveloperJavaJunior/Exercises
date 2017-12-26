

public class Task4RandomMonth {

	public static void main(String[] args) {
		int number = (int)(Math.random() * 12 + 1);

		if (number == 1) {
			System.out.println(" First mounth is January.");
		} else if (number == 2) {
			System.out.println(" Second mounth is February.");

		} else if (number == 3) {
			System.out.println(" Third mounth is March.");

		} else if (number == 4) {
			System.out.println(" Fourth mounth is April.");

		} else if (number == 5) {
			System.out.println(" Fifth mounth is May.");

		} else if (number == 6) {
			System.out.println(" Sixth mounth is June.");

		} else if (number == 7) {
			System.out.println(" Seventh mounth is July.");

		} else if (number == 8) {
			System.out.println(" Eighth mounth is August.");

		} else if (number == 9) {
			System.out.println(" Eighth mounth is September.");

		} else if (number == 10) {
			System.out.println(" Tenth mounth is October.");

		} else if (number == 11) {
			System.out.println(" Eleventh mounth is November.");

		} else {
			System.out.println(" Twelfth mounth is December.");
		}
	}

}
