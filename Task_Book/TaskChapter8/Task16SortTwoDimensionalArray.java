import java.util.*;

public class Task16SortTwoDimensionalArray {

	public static void main(String[] args) {
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },{ 4, 1 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				System.out.printf("matrix[%d][%d]=", i, j);
			}
			
		}
		System.out.println();
		sort(matrix);
	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length; i++)
			Arrays.sort(m[i]);

		for (int j = 0; j < m[0].length; j++) {
			int[] array = new int[m.length];
			for (int i = 0; i < m.length; i++) {
				array[i] = m[i][j];
				Arrays.sort(array);
			}
			for (int i = 0; i < m.length; i++) {
				m[i][j] = array[i];
			}
		}
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
		}
	}
}