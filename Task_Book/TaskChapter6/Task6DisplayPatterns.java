import java.util.*;

public class Task6DisplayPatterns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the number of lines:");

		int n = input.nextInt();
		input.close();

		displayPattern(n);
	}

	public static void displayPattern(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - 1); j++) {
			
			int numberOfDigit = 0;
			int remainder = n -(j -1);
			while(remainder != 0){
				numberOfDigit++;
				remainder /= 10;
			}
			for(int k = -1; k < numberOfDigit; k++){
				
			}
			}
			for(int j = i; j >= 1; j++){
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}

}
