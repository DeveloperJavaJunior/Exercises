package Test;

import java.util.Scanner;

public class Zad23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		
		// Tražiti od korisnika unos koordinata x,y
		System.out.print("Molimo unesite koordinate x i y odvojene razmakom: ");
		
		float x = unos.nextFloat();
		float y = unos.nextFloat();
		unos.close();
		if (x <= 5 && x >= (-5) && y <= 2.5 && y >= (-2.5) )
			System.out.println("Taèka je u pravougaoniku");
		else
			System.out.println("Taèka nije u pravougaoniku");
		
		}
	}
