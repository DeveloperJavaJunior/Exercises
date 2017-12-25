package zadaci_sa_predavanja_8_11_2017;

/*
 * @author Edin Korkic
 *
 *  Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji,
 *  koji su djeljivi i sa 5 i sa 6. Razmak izmeðu brojeva treba biti taèno jedan space.
 */

public class Zadatak_10 {

	public static void main(String[] args) {
		
		int numbersPerLine = 0;
	 
		for(int i = 100; i <= 1000; i++){
			
			if(i % 5 == 0 && i % 6 == 0){
			
				System.out.print(i + " ");
				
				numbersPerLine++;
				
				if(numbersPerLine % 10 == 0){
					
					System.out.println();
					
				}
			}
		}

	}

}
