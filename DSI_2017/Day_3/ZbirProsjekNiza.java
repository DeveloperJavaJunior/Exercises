package day_3;

public class ZbirProsjekNiza {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		int count = 0;
		double sum = 0;
		double prosjek = 0;

		int[] niz = new int[10];

		System.out.print(" Unesite niz duzine " + niz.length + " elemenata:");

		for (int i = 0; i < niz.length; i++) {
			niz[i] = in.nextInt();
			
			sum += niz[i];
			prosjek = sum / niz.length;
		}
			
			for (int i = 0; i < niz.length; i++) {
			if(niz[i] < prosjek){
				count++;
			}
			
		}
		
			in.close();
		
		System.out.println(" Zbir svih brojeva je:" + sum);
		System.out.println(" Prosjek svih brojeva je:" + prosjek);
		System.out.println(" Brojeva ispod prosjeka:" + count);
		
		
	}

}
