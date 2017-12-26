

public class FanClass {

	public static void main(String[] args) {

		Fan fan= new Fan(1, false, 5, "blue");
		fan.setOn(true);
		fan.setColor("blue");
		fan.setSpeed(3);

		System.out.println("Fan is on: ");
		System.out.println("Speed: " + fan.getSpeed());
		System.out.println("switch on: " + fan.isOn());
		System.out.println("radius: " + fan.getRadius());
		System.out.println("color: " + fan.getColor());

	}
}

class Fan {
	int speed;
	boolean on;
	double radius;
	String color;


	Fan() {
		 speed = 1;
		 on = false;
		 radius = 5;
		 color = "blue";

	}

	Fan(int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	}
	void setSpeed(int s) {
		speed = s;
	}

	void setOn(boolean open) {
		on = open;
	}

	void setRadius(double r) {
		radius = r;
	}

	void setColor(String c) {
		color = c;
	}

	int getSpeed() {
		return speed;
	}

	boolean isOn() {
		return on;
	}

	double getRadius() {
		return radius;
	}

	String getColor() {
		return color;
	}

}