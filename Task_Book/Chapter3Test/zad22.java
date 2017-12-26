package Test;

import java.util.Scanner;

public class zad22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos = new Scanner(System.in);
		
		System.out.print("Molimo unesite koordinate x i y odvojene razmakom: ");
		double x2 = unos.nextDouble(); // koordinata x unešena od korisnika
		double y2 = unos.nextDouble(); // koordinata y unešena od korisnika
		unos.close();
		
		double x1 = 0; // Centar kruga koordinata x
		double y1 = 0; // centar kruga koordinata y
		
		double razdaljina =Math.pow( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2),0.5);
		
		if (razdaljina <= 10)
			System.out.println("Taèka JE unutar kruga");
		else
			System.out.println("Taèka NIJE unutar kruga");
	}

}