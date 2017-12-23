package lekcija_6;

public class Zadatak1NaopakoBroj {
	
	public static void naopako(int broj) {
		
		while(broj != 0){
			int ostatak = broj % 10;
			System.out.print(ostatak);
			broj = broj / 10;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.print("Unesite cijeli broj: ");
		java.util.Scanner unos = new java.util.Scanner(System.in);
		int broj = unos.nextInt();
		unos.close();
		
		naopako(broj);

	}

}

