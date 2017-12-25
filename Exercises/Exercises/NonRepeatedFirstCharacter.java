import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedFirstCharacter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);// get input from console

		System.out.println(" Enter a String: ");

		String s = input.nextLine();// storing given string in a variable

		char c = getCharacter(s);// we have implement this method to get char

		System.out.println(" First Character which id repeating in a given String: " + c);

		input.close();// close

	}

	// we have implemeting the method here
	public static Character getCharacter(String s) {
		// this method takes sting as input and return character
		// now we need to store the characters in a hashmap,so that we easily
		// count the repetation of char in string
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		int i;
		Character c;
		for (i = 0; i < s.length(); i++) {
			c = s.charAt(i);				// here we assain a char which is in i*th position is a string
			if (hm.containsKey(c)) {		// here are we finding weather the char store in hashmap or not 
				hm.put(c, hm.get(c) + 1);	// we just addition 1 to the previous value
			} else {
				hm.put(c, 1); 		// if the char is not available in hashmap it will store
			
		}}
		// we just find out the first char which  is not repaeted
		for (i = 0; i < s.length(); i++) {
			c = s.charAt(i);	
			if (hm.get(c) == 1) {
				// if the char heaving only 1 repeated
				return c;
			}
		}
		
		return null;	// now all is ready to run this code
		// sorry I am not give any string here so I am getting this error, i will re run this
	}
}
