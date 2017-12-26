package Task_Chapter_10;

public class MyPoint_10_4 {

		double x, y;
		//no-arg konstruktor
		MyPoint_10_4() {
			x = 0;
			y = 0;
		}
		//konstruktor za odredjenim vrijednostima
		MyPoint_10_4(double x, double y) {
			this.x = x;
			this.y = y;
		}
		//x-getter
		double getX() {
			return x;
		}
		//y-getter
		double getY() {
			return y;
		}
		//metoda koja izracunava udaljenost dvije tacke
		double distance(MyPoint_10_4 n) {
			return distance(n.getX(), n.getY());
		}
		//metoda koja izracunava udaljenost dvije tacke
		double distance(double x, double y) {
			return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
		}
	}
	

