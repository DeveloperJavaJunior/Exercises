package zadaci;

public class Zad10BrojeviDjeljiviSa5I6 {

	public static void main(String[] args) {
		int counter = 1;// brojac ispisanih brojeva po liniji
		System.out.println("Brojevi u rasponu od 100 do 1000, koji su djeljivi sa 5 i 6: ");
		for (int i = 100; i < 1000; i++) { // u rasponu od 100 do 1000
			if (i % 5 == 0 && i % 6 == 0) { // ako je broj djeljiv i sa 5 i sa 6
				if (counter % 10 == 0) {// ako je broj ispisanih brojeva po liniji 10
					System.out.println(i + " ");// ispisi broj u novoj liniji
				} else {
					System.out.print(i + " ");// u suprotnom ispis broj u istoj liniji
				}
				counter++;
			}
		}
	}

}
