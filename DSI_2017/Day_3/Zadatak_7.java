package day_3;

public class Zadatak_7 {

	public static void main(String[] args) {

		int[] niz = { 1, 2, 3, 4, 5 };

		printArray(niz);
		System.out.println();
		printArray(randomArray(niz));

	}

	public static void printArray(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}

	}

	public static int[] randomArray(int[] niz) {

		niz = new int[5];
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);
			
		}

		return niz;

	}

}
