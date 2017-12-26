package Test;

import java.util.Scanner;

public class Zad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Temperatura mora biti u granicama od -51 do 41 (Farenhajta)");
		System.out.println("Brzina strujanja vjetra mora biti veæa od 2 (Milje/h)");
		System.out.println();
		
		Scanner unos = new Scanner(System.in);
		
		// Tražiti od korisnika unos temperature i brzine strujanja vjetra
		System.out.print("Molimo unesite temperaturu i brzinu strujanja vjetra odvojene razmakom: ");
		double temperatura = unos.nextDouble();
		double brzinaStrujanja = unos.nextDouble();
		double temperaturawindchill ;
		unos.close();
		
		// Uslov temperature i brzine strujanja
		if (temperatura > -51 && temperatura < 41 && brzinaStrujanja >= 2)
		{	
			temperaturawindchill = 35.74 + 0.6215 * temperatura - 35.75 * Math.pow(brzinaStrujanja, 0.16)
			+ 0.4275 * temperatura * Math.pow(brzinaStrujanja, 0.16);
		System.out.println("Twc je :" + (int)(temperaturawindchill  * 100) / 100.0);
		}
		else
		{
			System.out.println ("Temperatura ili brzina strujanja vjetra su izvan opsega");
		}
	}

}

	