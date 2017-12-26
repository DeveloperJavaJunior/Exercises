import java.util.*;

public class Task9ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a character:");
		
		String s = input.nextLine();
		char ch = s.charAt(0);
		input.close();
		
		System.out.println(" The unicode for the character " + ch + " is " + (int)ch);
		

	}

}
