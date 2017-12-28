package week05;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite slovo: ");
		String slovo = input.next().toLowerCase();
		System.out.print("The coresonding number is: ");
		if("abc".contains(slovo)){
			System.out.print(2);
		} else if("def".contains(slovo)){
			System.out.print(3);
		}
		else if("ghi".contains(slovo)){
			System.out.print(4);
		}
		else if("jkl".contains(slovo)){
			System.out.print(5);
		}
		else if("mno".contains(slovo)){
			System.out.print(6);
		}
		else if("pqrs".contains(slovo)){
			System.out.print(7);
		}
		else if("tuv".contains(slovo)){
			System.out.print(8);
		}
		else if("wxyz".contains(slovo)){
			System.out.print(9);
		}
		else {
			System.out.println("Nepostojece slovo");
		}
	}

}
