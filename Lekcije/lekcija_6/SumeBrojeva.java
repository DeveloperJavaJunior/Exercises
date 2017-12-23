package lekcija_6;

public class SumeBrojeva {

	public static void main(String[] args) {

		int suma = 0;

		for (int i = 1; i <= 10; i++) {
			suma += i;
		}
		System.out.println("Suma svih brojeva u rasponu od 1 do 10 je: " + suma);
		
		 suma = 0;
		 
		for (int i = 34; i <= 67; i++) {
			suma += i;
		}
		System.out.println("Suma svih brojeva u rasponu od 34 do 67 je: " + suma);
		
		suma = 0;
		
		for (int i = 82; i <= 98; i++) {
			suma += i;
		}
		System.out.println("Suma svih brojeva u rasponu od 82 do 98 je: " + suma);
	}

}
