package Task_Chapter_10;

public class MyPointTest {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(0,0);
		MyPoint p2 = new MyPoint(10,30.5);
		 
		System.out.printf( "The distance between the points (0,0) and (10,30.5) is %f ", MyPoint.distance(p1,p2));

	}

}
