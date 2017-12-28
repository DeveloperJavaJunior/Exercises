package week06;

public class Zadatak06 {

	public static void main(String[] args) {
		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));

	}

	public static String convertMillis(long millis) {
		long seconds = millis / 1000;
		long minutes = seconds / 60;
		seconds %= 60;
		long hours = minutes / 60;
		minutes %= 60;
		return hours + ":" + minutes + ":" + seconds;
	}

}
