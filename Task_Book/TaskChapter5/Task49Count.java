import java.util.*;

public class Task49Count {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a string:");

		String s = input.nextLine();
		input.close();
		String s1 = "";

		int numberofVowel = 0;
		int numberofCon = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			switch(s.toLowerCase().charAt(i)){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			numberofVowel++;
			break;
			case ' ':
			break;
			default:
		    numberofCon++;
			break;
			
			
			
			}
		}
		System.out.println(" The number of vowels is " + numberofVowel);
		System.out.println(" The number of consonants is " + (numberofCon - 1));

	}

}
