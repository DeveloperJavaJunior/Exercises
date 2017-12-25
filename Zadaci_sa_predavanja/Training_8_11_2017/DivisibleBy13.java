package training_8_11_2017;

import java.util.Scanner;

/*
 * @author Edin Korkic
 *
 *  Napisati program koji pita korisnika da unese neki cijeli broj. Kada je korisnik
 *  unijeo broj, program ispisuje sve brojeve djeljive sa 13. 
 *  Unesite cijeli broj kao gornju granicu: 100
 *  Brojevi djeljivi sa 13 u rasponu od 1 do 100 su: 13 26 39 52 65 78 91 
 *
 */

public class DivisibleBy13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" Unesite cijeli broj kao gornju granicu: ");
	int num = input.nextInt();
	
	input.close();
	
	System.out.printf(" Brojevi djeljivi sa 13 u rasponu od 1 do %d su:\n",num);
	
	for(int i = 1; i <= num; i++){
		if(i % 13 == 0){
			
			System.out.printf(" %d ",i);
		}
	}

	}

}
