package exercises;

/**
 * 
 * Napisati program koji konvertuje milisekunde u sate,minute i sekunde
 * koristeæi sljedeæi header : public static String convertMillis(long Millis)
 * Metoda vraæa string kao sati:minute:sekunde. Primjer convertMillis(5500)
 * vraæa 0:0:5. convertMillis(100000) vraæa 0:1:40
 *
 */

public class ConvertSecond {

	public static void main(String[] args) {

		System.out.format("%s\n", convertMillis(5500));
		System.out.format("%s", convertMillis(100000));

	}

	public static String convertMillis(long Millis) {

		long seconds = Millis / 1000;
		long minutes = seconds / 60;
		long hours = minutes / 60;

		String time = hours % 24 + ":" + minutes % 60 + ":" + seconds % 60;

		return time;
	}
}