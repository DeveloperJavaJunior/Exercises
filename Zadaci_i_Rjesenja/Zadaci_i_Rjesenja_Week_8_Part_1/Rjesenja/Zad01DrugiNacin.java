package part2;

import java.util.Arrays;
import java.util.Collections;

public class Zad01DrugiNacin {
	public static void main(String[] args) {
		int[][] hours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };
		
		String[] employees = new String[hours.length];//niz radnika
		Arrays.fill(employees, "");
		
		//stampanje zaglavlja
		System.out.println("\t     Su    M    T    W    Th   F   Sa");
		
		for (int i = 0; i < hours.length; i++) {
			int sum = 0;
			System.out.print("Employee " + i + "    ");
			for (int j = 0; j < hours[i].length; j++) {
				System.out.print(hours[i][j] + "    ");
				sum += hours[i][j]; // dodavanje sati radnika na njegovu ukupnu sumu
			}
			employees[i] += sum + " hours - employee # " + i;//dodajemo ukupnu sumu sati radnika na njegov indeks u nizu radnika
			System.out.println();
		}
		System.out.println();
		Arrays.sort(employees,Collections.reverseOrder()); //sortiramo niz radnika prema ukupnom broju radnih sati
		
		//stampanje broja sati i radnika
		for (int i = 0; i < employees.length; i++) { 
			System.out.println(employees[i]);
		}
	}
}

