package zadaci_sa_predavanja_27_10_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_ {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int[]array = new int[10];
		 
		 System.out.print(" Enter 10 number:");
		 
		 for(int i = 0; i < array.length; i++){
			 array[i] = input.nextInt();
		 }
		 input.close();
System.out.println(array);
	}
	public static ArrayList<Integer> arrayList(int[] array) {
		ArrayList<Integer>list = new ArrayList<>();
		
		return list;
		
	}
	public static int arraySort(int[] array) {
		
		return 0;
	}

}
