import java.util.Calendar;


public class Time {

	private long hour;
	private long minute;
	private long second;

	public static void main(String[] args) {

		Time time1 = new Time();
		Time time2 = new Time();
		time2.setTime(555550000);

		System.out.println(" The first time is:" + time1.hour + ":"
				+ time1.minute + ":" + time1.second);
		System.out.println(" The second time is:" + time2.hour + ":"
				+ time2.minute + ":" + time2.second);

	}
public Time(){
	
	Calendar cal = Calendar.getInstance();
	hour = cal.get(Calendar.HOUR_OF_DAY);
	minute = cal.get(Calendar.MINUTE);
	second = cal.get(Calendar.SECOND);
}

public void setTime(long elapsedTime){
	
	Calendar cal = Calendar.getInstance();
	cal.setTimeInMillis(elapsedTime);
	hour = cal.get(Calendar.HOUR_OF_DAY);
	minute = cal.get(Calendar.MINUTE);
	second = cal.get(Calendar.SECOND);
	
}
}
	