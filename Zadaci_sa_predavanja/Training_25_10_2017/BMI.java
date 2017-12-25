package training_25_10_2017;

/*
 *  @uthor Edin Korkic
 *  
 *  BMI    				Intepretacija
 *  BMI < 18.5    		Pothranjenost
 *  18.5 ≤ BMI < 25.0   Normalan BMI
 *  25.0 ≤ BMI < 30.0   Gojaznost
 *  30.0 ≤ BMI    		Pretilost
 *  
 *  Formula za izračunavanje BMI-a: težina / (visina * visina)
 * 
 */ 

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);

		System.out.print(" Unesite vašu težinu u kilogramima:");
		double tezina = unos.nextDouble();
		
		System.out.print(" Unesite vašu visinu u metrima:");
		double visina = unos.nextDouble();
		
		unos.close();
		
		double bmi = tezina / (visina * visina);
		System.out.printf(" Vaš BMI iznosi %.2f ", bmi);

		if (bmi < 18.5) {
			System.out.printf(" Pothranjenost ");
			
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.printf(" Normalan BMI ");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.printf(" Gojaznost ");
		} else {
			System.out.printf(" Pretilost  ");
		}

	}

}
