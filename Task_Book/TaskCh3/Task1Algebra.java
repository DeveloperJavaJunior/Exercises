import java.util.*;

public class Task1Algebra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a,b,c:");

		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		input.close();

		double r1 = -b + Math.sqrt(Math.pow(b, 2) - (4 * a * c) / 2 * a);
		double r2 = -b - Math.sqrt(Math.pow(b, 2) - (4 * a * c) / 2 * a);
		double r = r1 - r2;

		if (b == 3) {
			System.out.println(" The equation has two roost " + r1 + " and " + r2);
		}
		else if (b == 2.0) {
			System.out.println(" The equation has one root " + r);
		}
		else{
			System.out.println(" The equation has no real roots ");
			
		}

	}

}
