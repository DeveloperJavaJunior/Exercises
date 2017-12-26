import java.util.*;

public class Task20ProcessString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Input a string:");
		
		 String s = input.nextLine();
		input.close();
		
		String firstLetter = "";
		firstLetter = String.valueOf(s.charAt(0));
		
		System.out.println(" Length string is:" + s.length());
		System.out.println(" First letter string is:" + firstLetter);

	}

	

}
