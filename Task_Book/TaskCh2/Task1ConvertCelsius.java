import java.util.*;

public class Task1ConvertCelsius {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a temperature in celsius:");
		
		double celsius = input.nextDouble();
		input.close();
		
		double fahrenheit;
		fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.println(" " + " Celsius is " + fahrenheit + " Fahrenheit.");

	}

}
