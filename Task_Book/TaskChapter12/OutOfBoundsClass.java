import java.util.Scanner;


public class OutOfBoundsClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		OutOfBounds bounds = new OutOfBounds();
		System.out.println("Enter index: ");
		int a = input.nextInt();
		input.close();
	
		try {
			System.out.print("The index number is: ");
			bounds.randomNumbers(a);
	} 
		catch (Exception e) {
		}
	}
	}
	
