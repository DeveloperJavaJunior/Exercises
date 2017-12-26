import java.util.*;

public class Task4Geometry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a side:");

		double s = input.nextDouble();
		input.close();

		double area = 6 * Math.pow(s, 2) / (4 * Math.tan(3.14159 / 6));

		System.out.println(" The area of the hexagon is " + area);

	}

} 
