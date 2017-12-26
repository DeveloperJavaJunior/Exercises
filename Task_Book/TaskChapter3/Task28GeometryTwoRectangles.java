import java.util.*;

public class Task28GeometryTwoRectangles {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print(" Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double w1 = in.nextDouble();
		double h1 = in.nextDouble();
		
		System.out.print(" Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double w2 = in.nextDouble();
		double h2 = in.nextDouble();
		
		in.close();
		
		/** dijelimo visinu i širinu sa 2*/
		w1 = w1 / 2;
		h1 = h1 / 2;
		w2 = w2 / 2;
		h2 = h2 / 2;
		
		/** proraèun rastojanja r1 i r2*/
		double x1max = x1 + w1;
		double y1max = y1 + h1;
		double x1min = x1 - w1;
		double y1min = y1 - h1;
		double x2max = x2 + w2;
		double y2max = y2 + h2;
		double x2min = x2 - w2;
		double y2min = y2 - h2;
		
		/** postavljamo uslov za ispitivanje poklapanja*/
		 if (x1max == x2max && x1min == x2min && y1max == y2max  && y1min == y2min) {
				    System.out.print("r1 and r2 are indentical");
		 } else if (x1max <= x2max && x1min >= x2min && y1max <= y2max
				 && y1min >= y2min) {
			 System.out.print("r1 is inside r2");
		 } else if (x2max <= x1max && x2min >= x1min && y2max <= y1max
				 && y2min >= y1min) {
			 System.out.print("r2 is inside r1");
		 } else if (x1max < x2min || x1min > x2max || y1max < y2min
				 || y2min > y1max) {
			 System.out.print("r2 does not overlaps r1");
		 } else {
			 System.out.print("r2 overlaps r1");
		 }
	}
}