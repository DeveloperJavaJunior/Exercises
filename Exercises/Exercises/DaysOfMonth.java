import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 */

public class DaysOfMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite godinu: ");

		int year = input.nextInt();

		System.out.print(" Unesite prva tri slova imena mjeseca(prvo slovo uppercase): ");

		String month = input.next();

		input.close();

		switch (month) {

		case "Jan":
		case "Mar":
		case "May":
		case "Jul":
		case "Aug":
		case "Oct":
		case "Dec":
			System.out.printf(" %s %d ima 31 dan.", month, year);
			break;

		case "Apr":
		case "Jun":
		case "Sep":
		case "Nov":
			System.out.printf(" %s %d ima 30 dana.", month, year);
			break;

		case "Feb":
			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.printf(" %s %d ima 29 dana.", month, year);
				break;
			} else {
				System.out.printf(" %s %d ima 28 dana.", month, year);
				break;
			}
			default:
				System.out.printf(" Pogresan unos,pokusajte ponovo.");
				break;
		}

	}

}
