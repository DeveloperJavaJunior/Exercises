

public class Task1ConvertCelsius {

	public static void main(String[] args) {
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Input a temperature in celsius:");
		
		int celsius = in.nextInt();
		in.close();
		
		double fahrenheit;
		fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.printf(" %2d Celsius is %.1f Fahrenheit.", celsius, fahrenheit);

	}

}
