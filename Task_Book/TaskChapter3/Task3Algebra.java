
public class Task3Algebra {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter a,b,c,d,e,f:");

		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		double e = in.nextDouble();
		double f = in.nextDouble();
		in.close();

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if ((a * d - b * c) != 0) {
			System.out.println(" x is " + x + " and y is " + y);
		} else {
			System.out.println(" The equation has no solution.");

		}

	}

}
