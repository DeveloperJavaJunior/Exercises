import java.util.*;

public class Task35GeometryArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the side:");

		double s = input.nextDouble();
		input.close();

		System.out.println(" The area of pentagon is:" + area(s));
	}

	public static double area(double side) {
		return 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
	}
}
