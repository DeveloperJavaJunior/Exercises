package Task_Chapter_10;

public class MyPoint {

	private double x;
	private double y;

	public double getX() {

		return x;

	}

	public double getY() {

		return y;

	}

	

	public MyPoint(double x, double y) {

		this.x = x;
		this.y = y;

	}

	public double distance(MyPoint secondPoint) {

		return distance(this, secondPoint);

	}

	public static double distance(MyPoint p1, MyPoint p2) {

		// d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
		return Math.sqrt(Math.pow((p2.x - p1.x), 2)
				+ Math.pow((p2.y - p1.y), 2));

	}

}