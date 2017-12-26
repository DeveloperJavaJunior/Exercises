import java.util.*;

public class Task4ConvertPounds {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a number in pounds:");

		double pounds = input.nextDouble();
		input.close();
		double kilograms = pounds * 0.454;


		System.out.println(" pounds is " + kilograms + " kilograms ");

	}

}
