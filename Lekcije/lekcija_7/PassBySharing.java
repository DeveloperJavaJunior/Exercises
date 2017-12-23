package lekcija_7;

public class PassBySharing {
	/*  Proslijedi dijeljenjem  */
	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int n : array(array)) {
			System.out.print(n + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static int[] array(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		return array;
	}
}
