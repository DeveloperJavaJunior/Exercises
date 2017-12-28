package week05;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a side: ");
		double side = input.nextDouble();
		
		double area = ( 6 * Math.pow(side, 2)) / ( 4 * Math.tan(Math.PI / 6));
		System.out.println("The area of the hexagon is: " + area);
	}

}
