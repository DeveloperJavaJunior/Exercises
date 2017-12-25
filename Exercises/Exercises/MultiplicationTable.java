import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesi broj: ");
		
		int number = input.nextInt();
		
		input.close();
		
		for(int i = 1; i <= 10; i++){
			
			System.out.printf(" %d x %d = %d\n", number, i, number * i);
		}

	}

}
