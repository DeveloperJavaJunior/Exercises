package Test;

import java.util.Scanner;

public class PronaðiDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		// Traži od korisnika da unese koji je dan
		System.out.print("Molimo unesite dan(broj od 0 do 6)  u sedmici" + 
		"(0 je Nedjelja,... 6 je Subota):  ");
		int danUSedmici = unos.nextInt();
		
		//Traži od korisnika da unese broj dana do sastanka (na primer)
		System.out.print("Molimo unesite broj dana poèevši od sutrašnjeg do vašeg sastanka: ");
		int brojDana = unos.nextInt();
		unos.close();
		
		//Izraèunaj dan u sedmici
		int buduciDan = (int)(danUSedmici + brojDana)%7;
		
		System.out.println(buduciDan);

	}

	}


