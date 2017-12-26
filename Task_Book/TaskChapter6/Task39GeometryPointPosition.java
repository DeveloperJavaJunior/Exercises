import java.util.*;

public class Task39GeometryPointPosition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three points for p1, p2, and p3:");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		input.close();

		String p1 = "(" + x1 + ", " + y1 + ")";
		String p2 = "(" + x2 + ", " + y2 + ")";
		String p3 = "(" + x3 + ", " + y3 + ")";

		if (leftOfTheLine(x1, y1, x2, y2, x3, y3)) {
			System.out.println(p2 + " is on the left side of the line from "
					+ p1 + " to " + p2);
		} else if (onTheSameLine(x1, y1, x2, y2, x3, y3)) {
			if (onTheLineSegment(x1, y1, x2, y2, x3, y3)) {
				System.out.println(p2 + " is on the line segment from " + p3
						+ " to " + p1);
			} else {
				System.out.println(p2 + " is on the same line from " + p3
						+ " to " + p1);
			}

		} else {
			System.out.println(p2 + " is on the right side of the line from "
					+ p3 + " to " + p1);
		}

	}

	public static boolean leftOfTheLine(double x1, double y1, double x2,
			double y2, double x3, double y3) {
		double c = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
		if (c > 0) {
			return true;
		}

		return false;
	}

	public static boolean onTheSameLine(double x1, double y1, double x2,
			double y2, double x3, double y3) {

		double c = (x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1);
		if (c == 0) {
			return true;
		}

		return false;
	}

	public static boolean onTheLineSegment(double x1,
			double y1, double x2, double y2, double x3, double y3 ) {

		if (onTheSameLine(x1, y1, x2, y2, x3, y3)) {

			if (((x3 < x2 && x3 > x1) || (x3 < x1 && x3 > x2))
					&& ((y3 < y2 && y3 > y1) || (y3 < y1 && y3 > y2))) {
				return true;
			}
		}
		return false;
	}
}