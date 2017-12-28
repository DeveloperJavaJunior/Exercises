package week03_2;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.print("Unesi broj: ");
		int broj = unos.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(broj + " * " + i + " = " + (broj * i));
		}
		
		unos.close();
	}

}
