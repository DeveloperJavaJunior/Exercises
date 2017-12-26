package Task_Chapter_10;

public class Time_Test {

	public static void main(String[] args) {
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		System.out.printf(" The current time is:%d:%d:%d \n", time1.hour, time1.minute, time1.second);
		System.out.printf(" The elapsed time is:%d:%d:%d ", time2.hour, time2.minute, time2.second);

	}

}
