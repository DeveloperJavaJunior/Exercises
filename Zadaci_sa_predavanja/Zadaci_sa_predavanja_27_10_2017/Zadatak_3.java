package zadaci_sa_predavanja_27_10_2017;

import java.util.Scanner;

/*
 *  @author Edin Korkic
 *  
 *  Napisati program koji konvertuje funte u kilograme. Program tražiod korisnika da unese vrijednost u funtama, 
 *  konvertuje tu vrijednost u kilograme i ispisuje rezultat.Jedna funta iznosi 0.454 kilograma.
 *  Sample run programa:
 *  Unesite vrijednost u funtama: 55.5
 *  55.5 funti iznosi 25.197 kilograma

 *
 */

public class Zadatak_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite vrijednost u funtama:");
		
		double funte = input.nextDouble();
		input.close();
		
		double kilogrami = funte * 0.454;
		
		System.out.printf(" %.1f funti iznosi %.3f kilograma ", funte, kilogrami);

	}

}
