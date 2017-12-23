package exercises;

/**
 * 
 * Napisati program koji traži od korisnika da unese cijeli broj te ispisuje sve njegove najmanje faktore u rastuæem redoslijedu.
 * Primjer:
 * Unesite   cijeli broj: 120
 * Najmanji faktori su: 2,2,2,3,5
 *
 */

public class FaktoriBroja {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite cijeli broj:");
		
		int n = in.nextInt();
		in.close();
		int f = 2;
		
		System.out.print(" Najmanji faktori su:");
		
		while(n / f != 1){
			if(n % f == 0){
				System.out.print(f + " ");
				n /= f;
			}else{
				f++;
			}
		
		}
		System.out.println(n + " ");
	}
}