import java.util.*;

public class Task12RunwayLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print(" Enter speed and acceleration:");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		input.close();
		double length = speed * speed / (2 * acceleration);

		System.out.println(" The minimum runway length for this airplane is:"
				+ length);
	}

}
