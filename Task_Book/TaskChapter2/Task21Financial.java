import java.util.*;

public class Task21Financial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter investment amount:");
		double investment = input.nextDouble();
		
		System.out.print(" Enter annual interest rate in percentage:");
		double annual = input.nextDouble();
		
		System.out.print(" Enter number of years:");
		double numberyears = input.nextDouble();
		input.close();
		
		double monthly = annual / 1200;
		double value = investment * (1 + monthly) * numberyears * 12;
		
		System.out.print(" Accumulated value is $" + value);
	}

}
