package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji pita korisnika da unese trocifren cijeli broj i ispituje da li je taj broj
 *  palindrom. Broj je palindrom ako je isti èitajuæi s lijeva na desno i s desna na lijevo.
 *  Sample run programa:
 *  Unesite trocifren cijeli broj: 121
 *  Broj 121 je palindrom.
 *  Unesite trocifren cijeli broj: 123
 *  Broj 123 nije palindrom.
 *
 */

public class Zadatak_12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print(" Unesite trocifren cijeli broj:");
		int num = input.nextInt();
		
		input.close();
		
		int firstDigit = num / 100;
		int lastDigit = num % 10;
		
		if(firstDigit == lastDigit){
			System.out.printf(" Broj %d je palindrom.", num);
		}else{
		System.out.printf(" Broj %d nije palindrom.", num);
		}
	}

}
