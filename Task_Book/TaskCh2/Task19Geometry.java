import java.util.*;

public class Task19Geometry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter three points for a triangle:");

		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		input.close();
		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2,2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3,2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3,2));
		

		double side = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(side * (side - side1) * (side - side2) * (side - side3));

		System.out.println(" The area of a triangle is " + area);

	}

}
