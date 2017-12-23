package lekcija_6;

public class SabiranjeZadatak {
	
	public static int sabiranjeBrojeva(int a, int b){
		return a + b;
		
	}
	public static double sabiranjeBrojeva(double a, double b){
		return a + b;
		
	}

	public static void main(String[] args) {
		
		int rezultatCijeli = sabiranjeBrojeva(2, 4);
		System.out.println("rezultat sabiranja cijelih brojeva je: " + rezultatCijeli);
		
		double rezultatDecimalni = sabiranjeBrojeva(2, 4);
		System.out.println("rezultat sabiranja cijelih brojeva je: " + rezultatDecimalni);

	}

}
