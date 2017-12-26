
public class Task5FinancialApplication {

	public static void main(String[] args) {

		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter subtotal and a gratuity rate:");

		double subtotal = in.nextDouble();
		double gratuityrate = in.nextDouble();
		in.close();

		double gratuity = gratuityrate / 10;
		double total = subtotal + gratuity;

		System.out.println(" The gratuity is $" + gratuity + " and total is $"
				+ total);

	}

}
