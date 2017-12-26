import java.util.*;

public class Task5Geometry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter number of sides:");
		double n = input.nextDouble();
		
		System.out.print(" Enter the side:");
		double s = input.nextDouble();
		input.close();

		double area = n * Math.pow(s, 2) / (4 * Math.tan(3.14159 / n));

		System.out.println(" The area of the polygon is " + area);

	}

}
