import java.util.*;
public class Task7NumbersOfYears {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter number of minutes:");
		
		int minutes = input.nextInt();
		input.close();
		
		int hours = minutes / 60;
		int days = hours / 24;
		int years = days / 365;
		
		System.out.println(" minutes is approximately " + years + " years " + days + " days.");
	}

}
