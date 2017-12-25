package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *
 * Napisati program koji pita korisnika da unese radius(r) i visinu(H) cilindra te izraèunava
 * njegovu površinu i zapreminu koristeci  se slijedecim formulama:
 * povsina = 2 * r^2 * PI + H * 2 * r * PI
 * obim = r^2 * PI * H 
 * Sample run programa:
 * Unesite radius i duzinu cilindra:5,5 12
 * Povrsina cilindra iznosi 604.7565858160352 
 * Zapremina cilindra iznosi 1140.398133253095 
 *  
 */

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite radius i duzinu cilindra:");
		
		double radius = input.nextDouble();
		double visina = input.nextDouble();
		
		input.close();
		
		double povsina = 2 * Math.pow(radius, 2) * Math.PI + visina * 2 * radius * Math.PI;
		double zapremina = Math.pow(radius, 2) * Math.PI * visina;
		
		System.out.printf(" Povrsina cilindra iznosi %.13f \n", povsina);
		System.out.printf(" Zapremina cilindra iznosi %.12f ", zapremina);
		

	}

}
