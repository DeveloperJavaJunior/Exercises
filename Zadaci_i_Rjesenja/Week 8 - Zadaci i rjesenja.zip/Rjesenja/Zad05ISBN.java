import java.util.Scanner;

public class Zad05ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[9];// niz u koji cemo smjestiti prvih 9 cifri ISBN broja
		System.out.println("Unesite prvih 9 brojeva ISBN broja: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();// korisnikov unos cifri
		}
		input.close();
		// racunanje checksum-a
		int checksum = (array[0] * 1 + array[1] * 2 + array[2] * 3 + array[3]
				* 4 + array[4] * 5 + array[5] * 6 + array[6] * 7 + array[7] * 8 + array[8] * 9) % 11;
		
		String result = "";// promjenljiva u kojoj ce biti smjesten konacan ISBN broj
		
		for (int a : array) {
			result += a;// ubacivanje prvih 9 cifri u rezultat
		}
		
		if (checksum == 10) {// ako je checksum 10, zadnji broj oznacavamo sa X
			result += "X";
		} else {
			result += checksum;// ako nije 10 onda je zadnji broj iznos
								// checksum-a
		}
		
		System.out.println("ISBN broj je: " + result);// stampanje ISBN broja

	}

}
