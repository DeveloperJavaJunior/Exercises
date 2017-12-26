

public class Circle {

	/** The radius of this circle */
	double radius = 1;

	/** Construct a circle object */
	Circle() {

	}

	/** Construct a circle object */
	Circle(double newradius) {
		radius = newradius;
	}

	/** Return the area of this circle */
	double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return the perimeter of this circle */
	double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/** Set new radius for this circle */
	double setRadius(double newRadius){
		return radius =  newRadius;
		
	}

}

