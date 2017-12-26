import java.util.*;

public class Task23Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the driving distance:");
		double drivingdistance = input.nextDouble();
		
		System.out.print(" Enter miles per galon:");
		double miles = input.nextDouble();
		
		System.out.print(" Enter price per galon:");
		double price = input.nextDouble();
		input.close();
		
		double costdriving = drivingdistance / miles * price;
		System.out.println(" The cost of driving $" + costdriving);
		

	}

}
