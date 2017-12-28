package part2;

public class Zad02 {
	public static void fillArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 2);
			}
		}
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void printMost1s(int[][] arr) {
		int row = 0;
		int column = 0;
		int rowSum = 0;
		int columnSum = 0;
		for (int i = 0; i < arr.length; i++) {
			rowSum += arr[row][i];
			columnSum += arr[i][column];
		}

		for (int i = 0; i < arr.length; i++) {
			int sumRowTemp = 0;
			int sumColTemp = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sumRowTemp += arr[i][j];
				sumColTemp += arr[j][i];
			}

			if (sumRowTemp > rowSum) {
				rowSum = sumRowTemp;
				row = i;
			}
			if (sumColTemp > columnSum) {
				columnSum = sumColTemp;
				column = i;
			}
		}
		
		System.out.println("The largest row index: " + row);
		System.out.println("The largest column index: " + column);
	}

	public static void main(String[] args) {
		int[][] array = new int[4][4];
		fillArray(array);
		printArray(array);
		printMost1s(array);
	}

}
