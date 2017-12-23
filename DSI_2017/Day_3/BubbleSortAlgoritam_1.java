package day_3;

public class BubbleSortAlgoritam_1 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int[] niz = new int[10];

		System.out.print(" Unesite 10 brojeva odvojenih spaceom:");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = in.nextInt();
		}
		System.out.print(" Niz koji ste unijeli je:");
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
		System.out.println();
		System.out.print(" Nakon bubble sorta:");
		bubbleSort(niz);

	}

	public static void bubbleSort(int[] niz) {

		for (int i = 0; i < niz.length; i++) {
			for (int j = 0; j < niz.length - 1; j++) {
				if (niz[j] > niz[j + 1]) {
					int temp = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = temp;
				}
			}
		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");

		}

	}
}
