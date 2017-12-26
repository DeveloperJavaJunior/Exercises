
public class Task4ConvertPounds {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter a number in pounds:");

		double pounds = in.nextDouble();
		in.close();
		double kilograms = pounds * 0.454;

		System.out.println(" pounds is " + kilograms + " kilograms ");

	}

}
