package lekcija_4;

import java.util.Scanner;

public class Zadatak1DuzinaIPrvoSlovoStringa {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite neki string: ");
		String unijetiString = unos.nextLine();
		unos.close();
		
		System.out.println("Duzina stringa je: " + unijetiString.length());
		System.out.println("Prvi karakter stringa je: " + unijetiString.charAt(0));
 
	}

}
