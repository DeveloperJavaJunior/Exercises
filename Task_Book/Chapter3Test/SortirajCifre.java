package Test;

import java.util.Scanner;

public class SortirajCifre {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Kreiraj Scanner
		Scanner unos = new Scanner(System.in);
		
		// Tra�i od korisnika da unese cifre
		System.out.println("Molimo unesite tri cijela broja svaki odvojen razmakom:");
		int a = unos.nextInt();
		int b = unos.nextInt();
		int c = unos.nextInt();
		unos.close();
		
		if (a > b && b > c)
		{
			System.out.println("Va�e cifre su: " + b + a + c);
		}
		
		else
		{
			System.out.println("Va�e cifre su: "+ a + b + c);
		}


	}

}
