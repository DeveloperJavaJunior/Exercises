import java.util.*;

public class Task6SumDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a number betwen 0 and 1000:");
		
		int number = input.nextInt();
		number = number / 10;
		input.close();
		
		int number1 = number % 10;
		int number2 = number / 10;
		
		System.out.println(" The sum of digits is:" + (number1 + number2 + number));
        
	}

}
