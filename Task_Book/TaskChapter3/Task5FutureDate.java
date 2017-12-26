

public class Task5FutureDate {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter today's day:");
		int today = in.nextInt();

		System.out.print(" Enter the number of days elapsed since today:");
		int future = in.nextInt();
		in.close();

		if (today == 0) {
			System.out.println(" Today is Sunday.");
		} else if (today == 1) {
			System.out.println(" Today is Monday.");
		} else if (today == 2) {
			System.out.println(" Today is Tuesday.");
		} else if (today == 3) {
			System.out.println(" Today is Wednesday.");
		} else if (today == 4) {
			System.out.println(" Today is Thursday.");
		} else if (today == 5) {
			System.out.println(" Today is Friday.");
		} else {
			System.out.println(" Today is Saturday.");
		}

		if ((today + future) % 7 == 0) {
			System.out.println(" Future day is Sunday.");
		} else if ((today + future) % 7 == 1) {
			System.out.println(" Future day is Monday.");
		} else if ((today + future) % 7 == 2) {
			System.out.println(" Future day is Tuesday.");
		} else if ((today + future) % 7 == 3) {
			System.out.println(" Future day is Wednessday.");
		} else if ((today + future) % 7 == 4) {
			System.out.println(" Future day is Thursday.");
		} else if ((today + future) % 7 == 5) {
			System.out.println(" Future day is Friday.");
		} else {
			System.out.println(" Future day is Saturday.");

		}
	}
}
