package week03_2;

public class Zadatak05 {

	public static void main(String[] args) {
		int brojRedova = 6;
		System.out.println("Pattern A:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern B:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j <= (brojRedova - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("Pattern C:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j <= (brojRedova - i); j++) {
				System.out.print("  ");
			}

			for (int z = i; z >= 1; z--) {
				System.out.print(z + " ");
			}
			System.out.println();
		}

		System.out.println("\nPattern D:");
		for (int i = 1; i <= brojRedova; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}

			for (int z = 1; z <= (brojRedova - i + 1); z++) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
	}

}
