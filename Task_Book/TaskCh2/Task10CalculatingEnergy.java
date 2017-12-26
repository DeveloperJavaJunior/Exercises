import java.util.*;

public class Task10CalculatingEnergy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the amount of water in kilograms:");
		double water = input.nextDouble();
		
		System.out.print(" Enter the initial emperature:");
		double initialTemperature = input.nextDouble();
		
		System.out.print(" Enter the final temperature:");
		double finalTemperature = input.nextDouble();
		input.close();
		
		double energy = water * (finalTemperature - initialTemperature) * 4184;
		System.out.println(" The energy needed is " + energy);
	}

}
