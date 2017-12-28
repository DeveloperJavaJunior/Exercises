package week05;

import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesi string");
		String str = input.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			boolean repeat = false;
			for(int j = 0; j < str.length(); j++){
				if(ch == str.charAt(j) && i != j){
					repeat = true;
					break;
				}
			}
			
			if(!repeat){
				System.out.println(ch);
				break;
			}
		}
	}
}
