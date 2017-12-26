import java.util.*;

public class Task14BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter weigth in pounds:");
		double weigth = input.nextDouble();
		
		System.out.print(" Enter height in inches:");
		double height = input.nextDouble();
		
		input.close();
		double bmi = weigth * 703 / (height * height);
		
		System.out.println(" BMI is " + bmi);

	}

}
