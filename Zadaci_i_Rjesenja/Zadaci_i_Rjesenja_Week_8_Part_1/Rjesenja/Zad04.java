package part2;

import java.util.Scanner;

public class Zad04 {

	public static int[] locateLargest(double[][] arr) {
		int row = 0;
		int column = 0;
		double max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					row = i;
					column = j;
				}
			}
		}
		return new int[] { row, column };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of rows and columns: ");
		int row = input.nextInt();
		int col = input.nextInt();
		double[][] matrix = new double[row][col];
		System.out.println("Enter the array: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		input.close();
		int[] location = locateLargest(matrix);
		System.out.println("The location of the largest element is at ("
				+ location[0] + "," + location[1] + ")");
	}

}
