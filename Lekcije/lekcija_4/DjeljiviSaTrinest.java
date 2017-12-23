package lekcija_4;

import java.util.Scanner;

public class DjeljiviSaTrinest {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite cijeli broj koji prestavlja gornju granicu: ");
		int gornjaGranica = unos.nextInt();
		unos.close();
		
		System.out.println("brojevi djeljivi sa 13 su: ");
		for(int i = 1; i < gornjaGranica; i++){
			if(i % 13 == 0){
				System.out.print(i + " ");
			}
		}

	}

}
