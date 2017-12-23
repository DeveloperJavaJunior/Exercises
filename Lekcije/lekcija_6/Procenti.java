package lekcija_6;

import java.util.Scanner;

public class Procenti {

	public static void main(String[] args) {
		 
		int brojacVelikihSlova = 0;
		 int brojacSlova = 0;
		 
		 Scanner unos = new Scanner(System.in);
		 
		 System.out.print("Unesite string: ");
		 String korisnikString = unos.nextLine();
		 unos.close();
		 
		 for(int i = 0; i < korisnikString.length(); i++){
			 
			 char ch = korisnikString.charAt(i);
			 
			 if(Character.isUpperCase(ch)){
				 brojacVelikihSlova++;
			 }else if(Character.isLetter(ch)){
				 brojacSlova++;
			 }
		 }
		 
		 double procenatVelikihSlova = (double) brojacVelikihSlova / brojacSlova * 100.0;
		 
		 System.out.println("procenat velikih slova: " + procenatVelikihSlova + "%");
		 System.out.println("procenat malih slova: " + (100 - procenatVelikihSlova) + "%");

	}

}
/*
		double procenatVelikihSlova = (double) brojacVelikihSlova / brojacSlova * 100.0;
		System.out.println("Procenat velikih slova: " + procenatVelikihSlova + "%");
		System.out.println("Procenat malih slova: " + (100 - procenatVelikihSlova) + "%");
	}

}*/
