package training_23_10_2017;

public class ObrnutiBroj {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.print(" Unesite trocifreni broj:");
		int broj = in.nextInt();
		
		in.close();
		
		int zadnjaCifra = broj %10;
		broj /= 10;
		int prezadnjaCifra = broj %10;
		broj /= 10;
		
		System.out.println("   "+ (zadnjaCifra + prezadnjaCifra + broj));
	}

}
