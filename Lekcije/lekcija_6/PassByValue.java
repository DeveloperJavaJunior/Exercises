package lekcija_6;

public class PassByValue {
	
	public static void povecajBroj(int broj) {
		
		broj++;
		System.out.println("Vrijednost varijable unutar metode je: " + broj);
		
	}

	public static void main(String[] args) {
		
		int varijabla = 1;
		
		System.out.println("Vrijednost varijable prije poziva metode je: " + varijabla);
		povecajBroj(varijabla);
		System.out.println("Vrijednost varijable nakon poziva metode je: " + varijabla);

	}

}
