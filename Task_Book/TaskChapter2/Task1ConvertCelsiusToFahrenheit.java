import java.util.*;

public class Task1ConvertCelsiusToFahrenheit {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Input a temperature in celsius:");
		
		
		double fahrenheit = in.nextDouble();
		in.close();
		//fahrenheit = (9.0 / 5) * celsius + 32;
		double celsius  =(5.0 / 9) * (fahrenheit - 32);
		
		System.out.printf(" %.2f Celsius is %.2f Fahrenheit.", celsius, fahrenheit);

	 
	 
	 
	}

}
