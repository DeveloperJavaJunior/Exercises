package zadaci;

public class Zad5Skolarina {

	public static void main(String[] args) {
		double rate = 0.05; // kamata
		double tuition = 10000; // pocetna skolarina
		for (int i = 1; i <= 10; i++) {
			tuition += tuition * rate; // racunanje skolarine 
		}
		// ispis rezultata zaokruzenog na 2 decimale
		System.out.println("Skolarina za 10. godinu ce iznositi: " + ((int)(tuition * 100)) / 100.0 );
	}

}
