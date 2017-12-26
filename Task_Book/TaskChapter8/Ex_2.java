
public class Ex_2 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Unesite iznos racuna + procenat racuna koji zelite ostaviti kao napojnicu: ");

		double racun = input.nextDouble();
		double procenatNapojnice = input.nextDouble();
		
		input.close();

		
		double napojnica = racun * procenatNapojnice;

		
		System.out.println("Ukupan racun za platiti je: " + (racun + napojnica));
		System.out.println("Od ukupnog racuna, napojnica je: " + napojnica);
	}


	}