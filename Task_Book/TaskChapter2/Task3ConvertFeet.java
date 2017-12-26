

public class Task3ConvertFeet {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter a value for feet:");

		double feet = in.nextDouble();
		in.close();
		double meter = feet * 0.305;

		System.out.println(" feet is " + meter + " metars ");

	}

}
