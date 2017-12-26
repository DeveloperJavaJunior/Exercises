package Test;

import java.util.Scanner;

public class BrojISBN10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos = new Scanner(System.in);
		
		// Traži od korisnika 9 cifara
		System.out.print("Molimo unesite devet jednocifrenih brojeva odvojenih razmakom: ");
		int d1 = unos.nextInt();
		int d2 = unos.nextInt();
		int d3 = unos.nextInt();
		int d4 = unos.nextInt();
		int d5 = unos.nextInt();
		int d6 = unos.nextInt();
		int d7 = unos.nextInt();
		int d8 = unos.nextInt();
		int d9 = unos.nextInt();
		unos.close();
		
		// Izraèunaj d10
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
				d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 != 10) // Ako d10 nije jednako 10
		{
			System.out.println("Broj ISBN - 10 je: " + d1 +""+ d2+""+""+ d3 +"" + "" + "" + d4 +
					"" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + d10);
		}
		
		else // Ako je d10 jednako  10
		{
			System.out.println("Broj ISBN - 10 je: " + d1 +""+ d2+""+""+ d3 +"" + "" + "" + d4 +
					"" + d5 + "" + d6 + "" + d7 + "" + d8 + "" + d9 + "" + "X");
		}
		
	}

}
