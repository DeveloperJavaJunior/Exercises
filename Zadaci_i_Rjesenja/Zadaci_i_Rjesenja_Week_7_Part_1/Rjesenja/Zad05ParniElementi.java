public class Zad05ParniElementi {

	public static void main(String[] args) {
		// novi niz od 20 elemenata
		int[] array = new int[20];
		// dodavanje random vrijednosti u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}

		// prolazimo sve elemente niza
		for (int num : array) {
			// ako je element paran broj, ispisujemo ga
			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}
	}

}
