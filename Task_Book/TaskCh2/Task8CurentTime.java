import java.util.*;

public class Task8CurentTime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the time zone offset to GMT:");
		
		long offset = input.nextInt();
		input.close();
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds =  (totalMilliseconds / 1000) + offset;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		 System.out.println(" The current time is " + currentHour + "." + currentMinute + "." + currentSecond +  " GMT ");
		
	}

}
