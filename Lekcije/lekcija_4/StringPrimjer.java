package lekcija_4;

import java.util.Scanner;

public class StringPrimjer {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Molimo vas unesite neki string: ");
		String unijetiString = unos.nextLine();
		unos.close();
		
		System.out.println("Duzina unijetog stringa je: " + unijetiString.length());
		System.out.println("Treci karakter u stringu je: " + unijetiString.charAt(2));
		System.out.println("String velikim slovima: " + unijetiString.toUpperCase());
		System.out.println("String malim slovima: " + unijetiString.toLowerCase());
		
	}

}
