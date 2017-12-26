public class IntersectingPointClass {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter x1 , y1, x2, y2, x3, y3, x4, y4:");

		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();
		double x4 = in.nextDouble();
		double y4 = in.nextDouble();
		in.close();
		
		
		double a = y1 - y2;
		double b = -(x1 - x2); 
		double c = (y3 - y4);
		double d = -(x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		IntersectingPoint i = new IntersectingPoint(x1, y1, x2, y2, x3, y3, x4,
				y4);

		if (i.isParallel() != 0) {
			System.out.println(" The intersecting point is at " + " ( "
					+ i.getX() + " , " + i.getY() + " ) ");
			
		} else {
			System.out.println(" The two lines are parallel ");
			
		}

	}

}

class IntersectingPoint {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;
	
	private double x;
	private double y;
	
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	
	IntersectingPoint() {

		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
		x3 = 0;
		y3 = 0;
		x4 = 0;
		y4 = 0;
		
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		
	}

	IntersectingPoint(double newX1, double newY1, double newX2, double newY2,
			double newX3, double newY3, double newX4, double newY4) {

		x1 = newX1;
		y1 = newY1;
		x2 = newX2;
		y2 = newY2;
		x3 = newX3;
		y3 = newY3;
		x4 = newX4;
		y4 = newY4;
	}

	public double getX1() {
		return x1;

	}

	public double getY1() {
		return y1;

	}

	public double getX2() {
		return x2;

	}

	public double getY2() {
		return y2;

	}

	public double getX3() {
		return x3;

	}

	public double getY3() {
		return y3;

	}

	public double getX4() {
		return x4;

	}

	public double getY4() {
		return y4;

	}
	IntersectingPoint(double newA, double newB, double newC, double newD,
			double newE, double newF, double newX4) {
		
		a = newA;
		b = newB;
		c = newC;
		d = newD;
		e = newE;
		f = newF;
	}
	public double getA(){
		return a;
		
	}
	public double getB(){
		return b;
		
	}
	public double getC(){
		return c;
		
	}
	public double getD(){
		return d;
		
	}
	public double getE(){
		return e;
		
	}
	public double getF(){
		return f;
		
	}
		
    

	public double isParallel() {
		return a * d - b * c;

	}

	public double getX() {

		return  x = (e * d - b * f) / (a * d - b * c);
		

	}

	public double getY() {
		
		return  y = (a * f - e * c) / (a * d - b * c);

	}

}