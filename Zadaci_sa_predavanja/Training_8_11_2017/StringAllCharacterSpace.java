package training_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji pita korisnika da unese string, a zatim prolazi kroz
 *  taj string i ispisuje svaki njegov karakter sa jednim spaceom razmaka.
 *  Unesite string: Kurente, crno dijete. 
 *  Karakteri stringa: K u r e n t e ,  c r n o   d i j e t e .
 */

public class StringAllCharacterSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite string: ");
		
		String s = input.nextLine();
		
		input.close();
		
		System.out.print(" Karakteri stringa: ");
		
		for(int i = 0; i < s.length(); i++){
			System.out.print(s.charAt(i) + " ");
		}
		
		

	}

}
