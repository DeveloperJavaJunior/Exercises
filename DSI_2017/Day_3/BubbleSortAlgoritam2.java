package day_3;

public class BubbleSortAlgoritam2 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		boolean tester;

		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite 10 brojeva odvojenih spaceom: ");

		// dodijeliti vrijednosti nizu
		for (int i = 0; i <= 9; i++) {
			numbers[i] = input.nextInt();
		}

		// ispisati orginalni niz
		System.out.print("Niz koji ste unijeli je: ");
		for (int e : numbers) {
			System.out.print(e + " ");
		}

		// buble sort implementacija
		do {
			tester = false;
			for (int i = 0; i < numbers.length - 1; i++) {
				if (numbers[i] > numbers[i + 1]) {
					// zamijeniti pozicije numbers[i] i numbers[i + 1]
					int temp = numbers[i];
					numbers[i] = numbers[i + 1];
					numbers[i + 1] = temp;
					tester = true;
				}
			}
		} while (tester);

		// ispisati niz nakon bubble sorta
		System.out.print("\nNiz nakon bubble sorta: ");
		for (int e : numbers) {
			System.out.print(e + " ");
		}
		
		//zatvoriti scanner
		input.close();
	}

}
