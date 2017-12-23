package day_1;

public class Zadatak_1 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print("Unesite brojeve(0 prekida unos):");
		
		int broj = in.nextInt();
		int suma = 0;
		
		while(broj != 0){
			suma += broj;
		}
		in.close();
		System.out.printf("Suma je:%d",suma);
	}

}
