package day_2;

public class Zadatak_7 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter a year:");
		int year = in.nextInt();

		System.out.format("Year %d  have %d days.", year,
				numbersOfDaysInAYear(year));

	}

	public static int numbersOfDaysInAYear(int year) {

		if (year % 400 == 0 && (year % 4 == 0 || year % 100 != 0)) {
			return 366;
		} else {
			return 365;
		}
	}

}
