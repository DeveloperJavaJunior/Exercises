package day_3;

public class Zadatak_5 {

	public static void main(String[] args) {

		int[] niz1 = { 1, 2, 3, 4, 5 };
		int[] niz2 = new int[niz1.length];

		for (int i = 0; i < niz1.length; i++) {
			niz2[i] = niz1[i];
			System.out.print(niz2[i] + " ");
		}
	}

}
