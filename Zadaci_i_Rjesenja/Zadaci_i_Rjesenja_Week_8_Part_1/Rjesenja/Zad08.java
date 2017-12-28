package part2;

import java.util.Scanner;

public class Zad08 {
	public static double[][] sortColumns(double[][] m) {
		double[][] result = copy(m);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < result[i].length; k++) {
					if (result[j][i] < result[k][i]) {
						double temp = result[j][i];
						result[j][i] = result[k][i];
						result[k][i] = temp;
					}
				}
			}
		}

		return result;
	}

	public static double[][] copy(double[][] arr) {
		double[][] copy = new double[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				copy[i][j] = arr[i][j];
			}
		}

		return copy;
	}

	public static void printArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void enterMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
	}

	public static void main(String[] args) {
		double[][] array = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row: ");
		enterMatrix(array);
		System.out.println("Original array: ");
		printArray(array);
		double[][] sortedArray = sortColumns(array);
		System.out.println("\nSorted array: ");
		printArray(sortedArray);
	}

}
