package training_23_10_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print(" Unesite cijenu bez pdv-a i postotak pdv-a:");
		
		double cijena = in.nextDouble();
		
		double pdvPostotak = in.nextDouble();
		
		in.close();
		
		
		double pdv = pdvPostotak / 10;
		
		double cijenaSaPdv = cijena + pdv;
		
		System.out.format(" Cijena bez pdv-a isnosi %.1f,a konaèna cijena je: %.1f", cijena, cijenaSaPdv);
		
		
	}

}
