package Test;

import java.util.Scanner;

public class Zad21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Scanner unos = new Scanner(System.in);
		
		System.out.print("Molimo unesite dan u mjesecu: ");
		int q = unos.nextInt(); // dan u mjesecu
		System.out.print("Molimo unesite redni broj mjesece 1 - 12: ");
		int m = unos.nextInt(); // redni broj mjeseca 
		System.out.print("Molimo unesite godinu: ");
		int godina = unos.nextInt(); // godina u kojoj se traži dan
		unos.close();
		
		int j = godina / 100; // vijek
		int k = godina % 100; // godina vijeka kao dvocifren broj
		int h; // Dan u sedmici
		
		if (m == 1) // ako je Januar 
		{
			m = 13; // konverzija rednog broja mjeseca 1 u 13
			j = godina-- / 100; // smanjnje godine za jedan i proraèun  vijeka
			k = godina-- % 100; // smanjnje godine za jedan i proraèun godine vijeka
			h = (q + 26 * (m+1)/10 + k + k / 4 + j / 4 + 5 * j) % 7;
			System.out.println("Dan u sedmici je: " + h);
		}
		else if (m == 2)
		{
			m = 14; // konverzija rednog broja mjeseca 1 u 14
			j = godina-- / 100; // smanjnje godine za jedan i proraèun  vijeka
			k = godina-- % 100; // smanjnje godine za jedan i proraèun godine vijeka
			h = (q + 26 * (m+1)/10 + k + k / 4 + j / 4 + 5 * j) % 7;
			System.out.println("Dan u sedmici je: " + h);	
		}
		else //  ostali mjeseci
		{
			h = (q + 26 * (m+1)/10 + k + k / 4 + j / 4 + 5 * j) % 7;
			System.out.println("Dan u sedmici je: " + h);
		}		
		System.out.print(" 0 - subota;");
		System.out.print(" 1 - je nedjelja;");
		System.out.print(" 2 - je ponedjeljak;");
		System.out.print(" 3 - je utorak;");
		System.out.print(" 4 - je srijeda;");
		System.out.print(" 5 - je èetvrtak;");
		System.out.print(" 6 - je petak;");
	}

}



