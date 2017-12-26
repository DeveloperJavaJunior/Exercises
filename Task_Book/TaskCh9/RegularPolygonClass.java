public class RegularPolygonClass {

	public static void main(String[] args) {

		RegularPolygon regular1 = new RegularPolygon();
		RegularPolygon regular2 = new RegularPolygon(6, 4);
		RegularPolygon regular3 = new RegularPolygon(10, 4, 5.6, 7.8);

		System.out.println(" The number of side " + regular1.n + " lenght side " + regular1.s + " area of the polygon " + regular1.getArea()
				+ " perimeter of the polygon is " + regular1.getPerimeter());
		System.out.println(" The number of side " + regular2.n + " lenght side " + regular2.s + " area of the polygon " + regular2.getArea()
				+ " perimeter of the polygon is " + regular2.getPerimeter());
		System.out.println(" The number of side " + regular3.n + " lenght side " + regular3.s + " area of the polygon " + regular3.getArea()
				+ " perimeter of the polygon is " + regular3.getPerimeter());
		

	}

}

class RegularPolygon {

	int n;
	double s;
	double x;
	double y;

	RegularPolygon() {

		n = 3;
		s = 1.0;
		x = 0.0;
		y = 0.0;
	}

	RegularPolygon(int n, double s) {

		this.n = n;
		this.s = s;
		this.x = 0;
		this.y = 0;
		
	}

	RegularPolygon(int n, double s, double x, double y) {

		this.n = n;
		this.s = s;
		this.x = x;
		this.y = y;
		
	}

	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public double getS() {
		return s;
	}
	public void setS(double s) {
		this.s = s;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	double getPerimeter() {
			return n * s;
	}
	double getArea() {
			return n * Math.pow(s, 2) / 4 * Math.tan(Math.PI / n);

	}
}