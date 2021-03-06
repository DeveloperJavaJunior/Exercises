import java.util.*;

public class Task30FinancialSaving1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Enter monthly saving:");
		double saving = input.nextDouble();

		System.out.print(" Enter interest rate:");
		double interest = input.nextDouble();
		interest /= 12 * 100;

		System.out.print(" Enter  number of months:");
		double numberMonths = input.nextDouble();

		input.close();
		double totalSaving = 0;

		for (int i = 1; i <= numberMonths; i++) {
			totalSaving = (totalSaving + saving) * (1 + interest);
		}
		System.out.print(" Total saving is " + totalSaving);
	}
}
