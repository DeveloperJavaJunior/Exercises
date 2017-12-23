package exercises;

/**
 * 
 * Napisati metodu koja ispisuje 3 broja u rastuæem redoslijedu. Program treba da traži od korisnika da unese brojeve. 
 * Header metode treba da izgleda : 
 * public static void dipslaySortedNumbers(double num1,double num2,double num3)
 *
 */

public class BrojeviRastuciRedoslijed {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Unesite tri broja:");
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		in.close();
		
		displaySortedNumbers(num1, num2, num3);
		
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		
		double temp;
		
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 > num3){
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if(num1 > num2){
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.format(" Sortrani brojevi: %.2f %.2f %.2f ", num1, num2, num3);
		
	}

}
