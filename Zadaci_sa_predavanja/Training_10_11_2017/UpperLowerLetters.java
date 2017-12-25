package training_10_11_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji izracunava procenat pojavljivanja velikih i 
 *  malih slova u nekom stringu koji unese korisnik.
 */

public class UpperLowerLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite string: ");
		String s = input.nextLine();
		
		input.close();
		
		int countUpper = 0;
		int countLower = 0;
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isUpperCase(s.charAt(i))){
				countUpper++;
			}if(Character.isLowerCase(s.charAt(i))){
				countLower++;
			}
		}
		
		System.out.printf(" Unijeti string ima velikih slova %d\n", countUpper);
		System.out.printf(" Unijeti string ima malih slova %d ",countLower);
	}

}
