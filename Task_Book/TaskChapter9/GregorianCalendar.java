

import java.util.Calendar;
import java.util.Date;

public class GregorianCalendar {

	java.util.Scanner in = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		GregorianCalendar calendar = new GregorianCalendar();

		System.out.println("Current time is " + new Date());

		System.out.println("Year:\t " + calendar.get(Calendar.YEAR));

		System.out.println("Month:\t " + calendar.get(Calendar.MONTH));

		System.out.println("Day:\t " + calendar.get(Calendar.DAY_OF_MONTH));

		calendar.setTimeInMillis(123456789765L);

		System.out.println("Year: " + calendar.get(Calendar.YEAR));

		System.out.println("Month: " + calendar.get(Calendar.MONTH));

		System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

	}

	private String get(int year) {
		return year;
	}

}