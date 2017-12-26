package Task_Chapter_10;

public class MyPoint_Test_10_4 {

	public static void main(String[] args) {
		
		MyPoint_10_4 p1 = new MyPoint_10_4();			
		MyPoint_10_4 p2 = new MyPoint_10_4(10, 30.5);	
		
		System.out.println("Distance: " + p1.distance(p2));

	}

}
