package day_3;

public class Zadatak_2 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		double[] niz = new double[5];

		System.out.print(" Unesite niz duzine " + niz.length + ":");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = in.nextDouble();

		}
		for (int i = 0; i < niz.length; i++) {

			System.out.print(niz[i] + " ");
		}
		in.close();
	}

}
