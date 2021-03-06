public class RectangleSecondClass {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		System.out.println(" The rectangle width " + rectangle1.width + " and height " + rectangle1.height);
		System.out.println(" The rectangle area is:" + rectangle1.getArea() + " and the perimeter of rectangle is:"
				+ rectangle1.getPerimeter());

		Rectangle rectangle2 = new Rectangle(4, 40);
		System.out.println(" The rectangle width " + rectangle2.width + " and height " + rectangle2.height);
		System.out.println(" The rectangle area is:" + rectangle2.getArea() + " and the perimeter of rectangle is:"
				+ rectangle2.getPerimeter());

		Rectangle rectangle3 = new Rectangle(3.5, 35.9);
		System.out.println(" The rectangle width " + rectangle3.width + " and height " + rectangle3.height);
		System.out.println(" The rectangle area is:" + rectangle3.getArea() + " and the perimeter of rectangle is:"
				+ rectangle3.getPerimeter());

	}
}

class Rectangle {

	double width;
	double height;

	Rectangle() {

		width = 1;
		height = 1;
	}

	Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	double getArea() {
		return width * height;
	}

	double getPerimeter() {
		return 2 * (width + height);

	}

}