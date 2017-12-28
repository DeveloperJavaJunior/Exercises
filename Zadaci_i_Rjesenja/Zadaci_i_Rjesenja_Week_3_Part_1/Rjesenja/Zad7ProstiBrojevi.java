package zadaci;

public class Zad7ProstiBrojevi {

	public static void main(String[] args) {
		int count = 0; // brojac ispisanih brojeva 
		System.out.println("Prosti brojevi su: ");
		
		for (int i = 2; i <= 1000; i++) { // petlja se vrti u rasponu od 2 do 1000
			boolean isPrime = true;	// promjenljiva koja oznacava da li je broj prost ili ne
			// provjeravamo da li je broj prost tako sto ga dijelimo sa brojevima od 2 do tog broja
			for (int j = 2; j < i; j++) {
				if (i % j == 0) { // ukoliko je broj djeljiv nekim brojem osim samim sobom, onda nije prost
					isPrime = false;
					break;
				}
			}
			if (isPrime && i != 0 && i != 1) { // ako je broj prost, i ako nije 0 i 1 onda ga stampamo
				count++;
				System.out.print(i + " ");
				if (count % 8 == 0) { // ako je isprintano 8 brojeva po liniji, onda prelazi u novi red
					System.out.println();
				}

			}
		}
	}

}
