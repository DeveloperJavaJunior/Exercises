package day_3;

public class Zadatak_8 {

	public static void main(String[] args) {
	
		int [] niz = new int[10];
		
		for(int i = 0; i < niz.length; i++){
			niz[i] = (int)(Math.random() * 10);
			System.out.print(niz[i] + " ");
			
		}
		System.out.println();
		for(int i = niz.length - 1; i >= 0; i--){
			
			System.out.print(niz[i] + " ");
		}
		
		

	}

}
