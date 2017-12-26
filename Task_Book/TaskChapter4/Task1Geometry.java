import java.util.*;

public class Task1Geometry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the length from the center to a vertex:");
		
		double r = input.nextDouble();
		input.close();
		
		double s = 2 * r * Math.sin(3.14159 / 5 );
        double area = 5 * Math.pow(s,2) / (4 * Math.tan(3.14159 / 5 ));
        area = Math.round(area * 100) / 100.0;
        
        System.out.println(area);
	}

}
