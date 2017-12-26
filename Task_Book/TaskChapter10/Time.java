package Task_Chapter_10;

public class Time {
	long hour, minute, second;

	Time() {
		setTime(System.currentTimeMillis());
	}

	Time(long n) {
		setTime(n);
	}

	Time(long hour, long minute, long second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	long getGour() {
		return hour;
	}

	long getMinute() {
		return minute;
	}

	long getSecond() {
		return second;
	}

	void setTime(long elapseTime) {
		second = elapseTime / 1000;
		minute = second / 60;
		hour = minute / 60;
		hour = hour % 24;
		minute = minute % 60;
		second = second % 60;
		;
	}
}
