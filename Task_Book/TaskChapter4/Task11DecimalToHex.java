import java.util.*;

public class Task11DecimalToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a decimal value(0 to 15):");
		
		int i = input.nextInt();
		input.close();
		
		if(i < 0 || i > 15){
			System.out.println(i + " is an invalid input.");
			System.exit(0);
		}
		
			System.out.println(" The hex value is " + Integer.toHexString(i).toUpperCase());
			
		
	}

}
 