package Task_Chapter_10;

import java.util.Calendar;

public class Time_10_1 {

	 long hour;
	 long minute;
	 long second;

	public Time_10_1() {

		Calendar cal = Calendar.getInstance();
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		setSecond(cal.get(Calendar.SECOND));
	}

	public void setTime(long elapsedTime) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(elapsedTime);
		hour = cal.get(Calendar.HOUR_OF_DAY);
		minute = cal.get(Calendar.MINUTE);
		setSecond(cal.get(Calendar.SECOND));

	}

	public long getSecond() {
		return second;
	}

	public void setSecond(long second) {
		this.second = second;
	}
}
