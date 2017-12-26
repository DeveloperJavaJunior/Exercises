package Test;

import java.util.Scanner;

public class Zad15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner unos = new Scanner(System.in);
		
		// Kreiranje broja lutrije (trocifrenog)
		int brojLutrije = (int) (Math.random() * 1000);
		
		// Odreðivanje cifara Lutrije
		int cifraLutrije1 = brojLutrije / 100;
		int cifraLutrije2 = (brojLutrije / 10) % 10;
		int cifraLutrije3 = brojLutrije % 10;
		
		// Tražiti od korisnika trocifren broj
		System.out.println("Molimo ukucajte trocifreni broj: ");
		int brojKorisnika = unos.nextInt();
		unos.close();
		
		// Odreðivanje cifara korisnika
		int cifraKorisnika1 = brojKorisnika / 100;
		int cifraKorisnika2 = (brojKorisnika / 10) % 10;
		int cifraKorisnika3 = brojKorisnika % 10;
		
		if (brojLutrije == brojKorisnika)
			System.out.println("Taèan pogodak, dobili ste: 10 000 KM ");
		
		else if(((cifraLutrije1 == cifraKorisnika1 || cifraLutrije1 == cifraKorisnika2 || cifraLutrije1 == cifraKorisnika3) 
			&& (cifraLutrije2 == cifraKorisnika1 || cifraLutrije2 == cifraKorisnika2 || cifraLutrije2 == cifraKorisnika3))
			&& (cifraLutrije3 == cifraKorisnika1 || cifraLutrije3 == cifraKorisnika2 || cifraLutrije3 == cifraKorisnika3))
			System.out.println("Dobili ste : 3 000 KM");
		
		else if ((cifraLutrije1 == cifraKorisnika1 || cifraLutrije1 == cifraKorisnika2 || cifraLutrije1 == cifraKorisnika3) 
			|| (cifraLutrije2 == cifraKorisnika1 || cifraLutrije2 == cifraKorisnika2 || cifraLutrije2 == cifraKorisnika3)
			|| (cifraLutrije3 == cifraKorisnika1 || cifraLutrije3 == cifraKorisnika2 || cifraLutrije3 == cifraKorisnika3))
			System.out.println("Dobili ste : 1 000 KM");
		
		else
			System.out.println("Bez pogodaka");
		
System.out.println("BROJ LUTRIJE JE: " + brojLutrije);
System.out.println("BROJ KOJI JE IGRAÈ ODIGRAO JE: " + brojKorisnika);
	



	}

}
