
public class Ex_1 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print(" Enter a number1:");
		int number1 = input.nextInt();
		
		System.out.print(" Enter a number2:");
		int number2 = input.nextInt();
		
		input.close();
		int result = number1 + number2;
		
		System.out.println(" Result is:" + result);
	}
}