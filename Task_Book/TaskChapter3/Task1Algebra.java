
public class Task1Algebra {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter a,b,c:");

		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		in.close();

		double d = Math.pow(b, 2) - (4 * a * c);

		if (d > 0) {
			double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2
					* a;
			double r2 = (-b - Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2
					* a;
			System.out.println(" The equation has two roost " + r1 + " and "
					+ r2);
		} else if (d == 0) {
			double r1 = (-b + Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5)) / 2
					* a;
			System.out.println(" The equation has one root " + r1);
		} else {
			System.out.println(" The equation has no real roots ");
		}
	}
}