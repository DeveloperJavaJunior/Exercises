package Test;

import java.util.Scanner;

public class zad11 {

	public static void main(String[] args) {
Scanner unos = new Scanner(System.in);
		
		// Traži od korisnika da unese godinu
		System.out.print("Molimo unesite godinu: ");
		int godina = unos.nextInt();
		
		boolean jePrestupnaGodina = ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0);
		
		// Traži od korisnika da unese mjesec:
		System.out.print(" Molimo unesite redni broj mjeseca za koji vas interesuje broj dana: ");
		int mjesec = unos.nextInt();
		unos.close();
		
			switch (mjesec)
			{
			case 1: System.out.println("Januar " + godina + " godine  ima 31 dan");break;
			case 2: 
				if (jePrestupnaGodina)
				{
				System.out.println("Februar " + godina + " godine ima 29 dana");
				}
				else
				{
					System.out.println("Februar " + godina + " godine ima 28 dana");
				};break;
			case 3: System.out.println("Mart " + godina + " godine ima 31 dan");break;
			case 4: System.out.println("April " + godina + " godine ima 30 dana");break;
			case 5: System.out.println("Maj " + godina +" godine ima 31 dan");break;
			case 6: System.out.println("Jun " + godina + " godine ima 30 dana");break;
			case 7: System.out.println("Jul " + godina + " ima 31 dan");break;
			case 8: System.out.println("Avgust " + godina + " godine ima 31 dan");break;
			case 9: System.out.println("Septembar " + godina + " godine ima 30 dana");break;
			case 10: System.out.println("Oktobar" + godina + " godine ima 31 dan");break;
			case 11: System.out.println("Novembar " + godina + " godine ima 30 dana");break;
			case 12: System.out.println("Decembar " + godina + " godineima 31 dan");
			}
	}

}


	


