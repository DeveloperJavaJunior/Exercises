package training_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji traži od korisnika da unese neki string, a zatim 
 *  ispisuje dužinu unijetog stringa i njegov prvi karakter.
 */

public class Stringlength {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite string: ");
		
		String s = input.nextLine();
		
		input.close();
		
		System.out.println(" Unijeti string je duzine " + s.length());
		System.out.println(" Prvi karakter unijetog stringa je " + s.charAt(0));

	}

}
