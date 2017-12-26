public class Task3Geography {

	public static void main(String[] args) {

		double x1 = 33.7489954;
		double y1 = -84.3879824;

		double x2 = 28.5383355;
		double y2 = -81.3792365;

		double x3 = 32.0835407;
		double y3 = -81.0998342;

		double x4 = 35.2270869;
		double y4 = -80.8431267;

		double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double s1 = (side1 + side2 + side3) / 2;
		double area1 = Math.sqrt(s1 * (s1 - side1) * (s1 - side2) * (s1 - side3));

		double side4 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
		double side5 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		double side6 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2));
		double s2 = (side4 + side5 + side6) / 2;
		double area2 = Math.sqrt(s2 * (s2 - side4) * (s2 - side5) * (s2 - side6));
		
		double area = area1 + area2;

		System.out.print("The area enclosed by four cities is " + area + " km^2.");

	}

}
