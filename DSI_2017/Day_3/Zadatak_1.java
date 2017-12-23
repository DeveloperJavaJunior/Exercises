package day_3;

public class Zadatak_1 {

	public static void main(String[] args) {

		int niz[] = new int[5];

		niz[0] = 2;
		niz[1] = 4;
		niz[2] = 6;
		niz[3] = 8;
		niz[4] = 9;

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

		niz[2] = 14;
		
		System.out.println();
		
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}
}
