package Test;

import java.util.Scanner;

public class zad13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	

Scanner unos = new Scanner(System.in);
		
		// Traži od korisnika unos trocifrenog broja
		System.out.print("Molimo unesite trocifren broj: ");
		int trocifreniBroj = unos.nextInt();
		unos.close();
		int cifra1 = trocifreniBroj / 100;
		int cifra3 = trocifreniBroj % 10;
		
		if (cifra1 == cifra3)
		{
			System.out.println("Broj je polindrom");
		}
		
		else
		{
		System.out.println("Broj nije polindrom");
		}

	}

}