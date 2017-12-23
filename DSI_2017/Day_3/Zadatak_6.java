package day_3;

public class Zadatak_6 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int[] niz1 = new int[10];
		int[] niz2 = new int[niz1.length];

		System.out.print(" Unesite niz duzine " + niz1.length + " elemenata:");

		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = in.nextInt();
			System.out.print(niz1[i] + " ");
		}
		
		in.close();
		System.out.println();
		
		for (int i = 0; i < niz1.length; i++) {
			niz2[i] = niz1[i];
			System.out.print(niz2[i] + " ");
		}

	}

}
