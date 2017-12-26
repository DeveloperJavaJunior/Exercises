import java.util.*;

public class Task8ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an ASCII code:");

		int code = input.nextInt();
		input.close();

		System.out.println(" The character for ASCII code " + code + " is " + (char)code);

	}

}
