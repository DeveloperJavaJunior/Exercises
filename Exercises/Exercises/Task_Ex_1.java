import java.util.*;

public class Task_Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1 = (int) (Math.random() * 10);
		int number2 = (int) (Math.random() * 10);

		System.out.println(number1 + " + " + number2 + " = ");

		int number3 = input.nextInt();
		input.close();

		if (number3 == number1 + number2)
			System.out.println(" Your answer is corect.");
		else
			System.out.println(" Your answer is  not corect.");
	}

}
