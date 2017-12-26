import java.util.*;

public class Task17WindChillTemperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out
				.print(" Enter the temperature in Fahrenheit between -58°F and 41°F:");
		double temperatur = input.nextDouble();

		System.out.print(" Enter the wind speed (>=2) in miles per hour:");
		double speed = input.nextDouble();

		input.close();
		double index = 35.74 + (0.6215 * temperatur) - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperatur* Math.pow(speed, 0.16);

		System.out.println(" The wind chill index is " + index);

	}

}
