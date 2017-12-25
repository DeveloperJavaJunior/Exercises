package training_10_11_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati metodu koja ispisuje cijeli broj naopako. 
 *  public static void naopako(int broj)
 *  public static int naopako(int broj)
 *  Pozive metode naopako(3456) treba da vrati vrijednost 6543.
 */

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite broj: ");

		int num = input.nextInt();
		input.close();
		
		reverse(num);
		System.out.printf("\n%d ",revers(num));

	}
	
	public static void reverse(int number1) {
		
		int number = Math.abs(number1);

		if (number >= 0 && number < 10)
			System.out.println(number);
		else {
			while (number != 0) {
				int reverse = number % 10;
				System.out.print(reverse);
				number /= 10;

			}}
			
		}
		public static int revers(int number) {
			
			String reverse = "";
			
			String s = number + "";
			
			for(int i = s.length()- 1; i >= 0; i--){
				
				reverse += s.charAt(i);
			
			number = Integer.parseInt(reverse);
			}
			return number;
		
	}
		
}
