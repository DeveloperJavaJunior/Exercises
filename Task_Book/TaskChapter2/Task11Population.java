import java.util.*;

public class Task11Population {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of years:");
		
		int years =input.nextInt();
		input.close();
		
		int current = 312032486;
		int time = years * 365 * 24 * 60 * 60;
		
		int birth = time / 7;
		int death = time / 13;
		
		int immigrant = time / 45;
		int newPopulation = current + birth - death + immigrant; 
		
		System.out.println(" The population in 5 years is " + newPopulation);
		
	}

}
