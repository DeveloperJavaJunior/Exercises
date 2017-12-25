package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 * 
 *  Napisati program koji sabira sljedeæu seriju 
 *  1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.                                                                                          
 */

public class Zadatak_1 {

	public static void main(String[] args) {

		double sum = 0;

		for (int i = 1; i <= 97;System.out.println(" Suma serije brojeva iznosi: " + sum), i += 2) {
			sum += i / (i + 2.0);

		}
	
	}

}
