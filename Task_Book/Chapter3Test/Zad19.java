package Test;

import java.util.Scanner;

public class Zad19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos = new Scanner(System.in);
		
		// Traži od korisnika da unese dužine stranica
		System.out.println("Molimo unesite dužine stranica a,b i c odvojene razmakom: ");
		float a = unos.nextFloat();
		float b = unos.nextFloat();
		float c = unos.nextFloat();
		float obimTrougla = a + b + c;
		unos.close();
		
		// Uslov za formiranje trougla
		
		if ((a + b) > c && (a + c) > b && (b + c) > a)
			System.out.println("Obim trougla je: " + obimTrougla);
		
		else
			System.out.println ("Uslov nije ispunjen");
	}

}
