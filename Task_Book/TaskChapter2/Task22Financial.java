import java.util.*;

public class Task22Financial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a value:");

		int value = input.nextInt();
		input.close();
		
		int dollars = value / 100;
		int cents = value % 100;

		System.out.println(" The 1156 cents is" + dollars + " dollars " + cents + " cents.");
	}

}
