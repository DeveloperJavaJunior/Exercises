package exercises;

/**
 * 
 * Napisati program koji traži od korisnika da unese string te ispisuje koliko je  slova u stringu. 
 * Za brojanje  slova u stringu koristiti metodu sa headerom:
 * public static int countLetters(String sentences)
 * Primjer: Unesite string: Java je zabavna!
 * Vaš string ima 13 slova!
 *
 */

public class DuzinaStringa {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite string:");
		
		String s = in.nextLine();
		in.close();
	
		System.out.format(" Vas string ima %d slova!", countLetters(s));
	}
	public static int  countLetters(String sentencens) {
		
		int count = 0;
		
		for(int  i = 0; i < sentencens.length(); i++){
			if(Character.isLetter(sentencens.charAt(i))){
				count++;
			}
		}
		return count;
		
	}

}
