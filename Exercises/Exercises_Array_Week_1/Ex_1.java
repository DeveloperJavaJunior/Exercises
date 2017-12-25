package exercises_Array_Week_1;

import java.util.Scanner;

/**20.11.2017
 * 
 * @author Edin Korkic
 *
 *         Napisati dvije overload-ane metode koje vraæaju aritmetièku
 *         sredinu(prosjek) niza sa sledeæim header-ima: public static int
 *         average(int[] array) public static double average(double[] array).
 *         Napisati test program koji kaže korisniku da unese 10 double brojeva,
 *         izraèunava prosjek pozivajuæi metodu i prikazuje prosjek tog niza
 *         brojeva.
 */
public class Ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] array = new double[10];
		
		System.out.print(" Unesite niz od 10 double brojeva odvojenih spaceom: ");
		
		for(int i = 0; i < array.length; i++){
			array[i] = input.nextDouble();
		}
		
		input.close();
		
		System.out.printf(" Prosjek niza je: %.1f ", average(array));
		
		
	}
public static int average(int[] array) {
	
	int sum = 0;
	
	for(int i = 0; i < array.length; i++){
		sum += array[i];
	}
	return sum / array.length;
	
	
}
public static double average(double[] array) {
	
	double sum = 0;
	
	for(int i = 0; i < array.length; i++){
		sum += array[i];
	}
	return sum / array.length;
	
}
}
