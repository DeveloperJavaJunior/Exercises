
public class Task8SortNumbers {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Input a three numbers:");

		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int number3 = in.nextInt();
		in.close();

		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		if (number2 > number3) {
			int temp = number2;
			number2 = number3;
			number3 = temp;
		}
		if (number1 > number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		System.out.println(" Number is non dreceasing order is " + number1
				+ " " + number2 + " " + number3);
	}

}
