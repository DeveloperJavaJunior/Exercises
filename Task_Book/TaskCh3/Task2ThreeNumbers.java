import java.util.*;

public class Task2ThreeNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a three numbers:");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		input.close();
		
		if( a + b == c){
			System.out.print(" The input is correct.");
			
		}
		else{
			System.out.print(" The input is incorrect.");
			
		}
	}

}
