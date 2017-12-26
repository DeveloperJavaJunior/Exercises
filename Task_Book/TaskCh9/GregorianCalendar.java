import java.util.Calendar;
import java.util.Date;

public class GregorianCalendar {

	public static void main(String[] args) {
		Date date = new Date(1234567898765L);

		System.out.println(date.toString());

		GregorianCalendar calendar = new GregorianCalendar();

		System.out.println("Current time is " + new Date());

		System.out.println("Year is " + calendar.get(Calendar.YEAR));

		System.out.println("Month is " + calendar.get(Calendar.MONTH));

		System.out.println("Day is " + calendar.get(Calendar.DAY_OF_MONTH));

	}

	private int get(int year) {
		return year;
	}

}