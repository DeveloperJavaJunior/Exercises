import java.util.*;

public class Task2VolumeCylinder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the radius and lenght of a cylinder:");

		
		double radius = input.nextDouble();
		double length = input.nextDouble();
		input.close();

		double area = radius * radius * 3.14159;
		double volume = area * length;

		System.out.println(" The area is:" + area);
		System.out.println(" The volume is:" + volume);
	}

}
