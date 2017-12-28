import java.util.Scanner;

public class Zad08Sortiranje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// novi Scanner
		Scanner input = new Scanner(System.in);
		// ispis poruke
		System.out.println("Unesite niz od 10 brojeva: ");
		// novi niz cija je duzina 10
		int[] array = new int[10];
		// dodavanje elemenata u niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		// vanjska petlja prolazi cijeli niz
		for(int i = 0; i < array.length; i++){
			// unutrasnja petlja prolazi niz od i do kraja niza
			for(int j = i; j < array.length; j++){
				// ako je broj na indeksu i manji od broja na indeksu j, zamijeni im vrijednosti
				if(array[i] < array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		// printanje niza
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
