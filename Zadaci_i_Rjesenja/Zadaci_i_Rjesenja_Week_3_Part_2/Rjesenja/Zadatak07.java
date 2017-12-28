package week03_2;

public class Zadatak07 {

	public static void main(String[] args) {
		
		System.out.print("Armstrongovi brojevi: ");
		for (int i = 0; i <= 1000; i++) {
			int suma = 0;
			int broj = i;
			while (broj != 0) {
				int cifra = broj % 10;
				suma += (cifra * cifra * cifra);
				broj /= 10;
			}

			if (suma == i) {
				System.out.print(i + " ");
			}

		}
	}

}
