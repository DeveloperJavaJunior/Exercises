import java.util.*;

public class Task12PalindromeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the three digit number:");
		
		int number = input.nextInt();
		input.close();
		
		int lastDigit = number % 10;
		 number = number / 10;
		
		int firstDigit = number / 10;
		
		if(firstDigit == lastDigit){
			System.out.println(" The number you enter is palidrom.");
		}
		else{
			System.out.println(" The number you entered is not palidrom.");
		}
			
	}

}
