package zadaci;

public class Zad9Kombinacije2Broja {

	public static void main(String[] args) {
		int combinationsCounter = 0;// broj mogucih kombinacija
		for (int i = 1; i <= 7; i++) { // prolazi sve brojeve od 1 do 7
			for (int j = i; j <= 7; j++) { // prolazi sve brojeve od i do 7
				if (i != j) { // ako broj nije taj isti broj
					combinationsCounter++;//povecavanje broja kombinacija
					System.out.print("(" + i + "," + j + ") ");//ispis kombinacije

				}
			}
			System.out.println(); // prelazak u novu liniju

		}
		System.out.println("\nBroj mogucih kombinacija je: "
				+ combinationsCounter);//ispis broja mogucih kombinacija
	}

}
