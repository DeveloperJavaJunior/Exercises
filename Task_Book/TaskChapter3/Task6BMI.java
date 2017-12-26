
public class Task6BMI {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter a weight in pounds:");
		int weight = in.nextInt();

		System.out.print(" Enter feet:");
		int feet = in.nextInt();

		System.out.print(" Enter inches:");
		int inches = in.nextInt();

		int bmi = (int) (weight * 703 / Math.pow(feet * inches, 2));
		System.out.println(" BMI is " + bmi);

		if (bmi < 18.5) {
			System.out.println(" Underweight ");
		} else if (bmi < 25) {
			System.out.println(" Normal ");
		} else if (bmi < 30) {
			System.out.println(" Overweight ");
		} else {
			System.out.println(" Obese ");
		}

	}

}
