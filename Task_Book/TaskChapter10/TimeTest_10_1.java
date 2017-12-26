package Task_Chapter_10;

public class TimeTest_10_1 {

	public static void main(String[] args) {
		
		Time_10_1 time1 = new Time_10_1();
		Time_10_1 time2 = new Time_10_1();
		time2.setTime(555550000);

		System.out.printf(" The current time is:%d:%d:%d \n", time1.hour, time1.minute, time1.getSecond());
		System.out.printf(" The elapsed time is:%d:%d:%d ", time2.hour, time2.minute, time2.getSecond());
		
	}

}
