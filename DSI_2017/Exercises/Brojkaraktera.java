package exercises;

/**
 * 
 * Napisati program koji traži od korisnika da unese string i karakter te
 * ispisuje koliko se puta taj karakter ponavlja u stringu. Za brojanje
 * pojavljivanja karaktera u stringu koristiti metodu sa headerom: public static
 * int countChar(String string,char ch) Primjer:Unesite string: Java je zabavna!
 * Unesite karakter: a Karakter a se u stringu pojavljuje 5 puta!
 *
 */

public class Brojkaraktera {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite string:");
		String s = in.nextLine();

		System.out.print(" Unesite karakter: ");
		char ch = in.next().charAt(0);
		
		System.out.format(" Karakter %c se u stringu pojavljuje %d puta! ", ch, countChar(s,ch));

	}

	public static int countChar(String string, char ch) {
		
		int count = 0;
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == ch) 
            	count++;
        }

        return count;


	}
}
