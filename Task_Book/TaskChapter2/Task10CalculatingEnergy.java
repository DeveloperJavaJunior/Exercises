
public class Task10CalculatingEnergy {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Enter the amount of water in kilograms:");
		double water = in.nextDouble();

		System.out.print(" Enter the initial emperature:");
		double initialTemperature = in.nextDouble();

		System.out.print(" Enter the final temperature:");
		double finalTemperature = in.nextDouble();
		in.close();

		double energy = water * (finalTemperature - initialTemperature) * 4184;
		System.out.println(" The energy needed is " + energy);
	}

}
