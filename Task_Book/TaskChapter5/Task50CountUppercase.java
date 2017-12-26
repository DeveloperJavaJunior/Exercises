import  java.util.*;

public class Task50CountUppercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a string:");

		String s = input.nextLine();
		input.close();
		
		int numberOfUp = 0;
		
		for(int i = s.length() - 1; i >= 0; i--){
			if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
				numberOfUp++;
			}
		}
		System.out.println(" The number of uppercase letters is:" + numberOfUp);
		

	}
 
}
