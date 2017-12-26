import java.util.*;

public class Task26Divisible {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a number:");
		
		int number = input.nextInt();
		input.close();
		
		if(number % 5 == 0 && number % 6 == 0){
			System.out.println(" Number is divisible 5 and 6.");
		}
		else if(number % 5 == 0){
		System.out.println(" Number is divisible 5.");
		}
		else if(number % 6 == 0){
		System.out.println(" Number is divisible 6.");
		}
		else {
		System.out.println(" Number is  not divisible  by 5 and 6.");
		}
	}

}
