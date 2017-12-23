package day_1;

public class Zadatak_2 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		int broj = 1;
		int suma = 0;

		System.out.print("Unesite brojeve(0 prekida unos):");
		do {

			broj = in.nextInt();
			suma += broj;
		} while (broj != 0);

		in.close();
		System.out.printf("Suma je:%d", suma);
	}

}
