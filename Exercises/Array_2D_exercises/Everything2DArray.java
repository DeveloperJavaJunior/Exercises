import java.util.*;

public class Everything2DArray {

	static Scanner s = new Scanner(System.in);

	// --- 1 dimension array Functions ---
	static void zero(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = 0;
	}

	static void input(int[] a) {
		for (int i = 0; i < a.length; i++)
			a[i] = s.nextInt();
	}

	static void output(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	static int findMax(int[] a) {
		int maxnum = a[0], maxplace = 0;
		for (int i = 1; i < a.length; i++)
			if (a[i] > maxnum) {
				maxnum = a[i];
				maxplace = i;
			}
		return maxplace;
	}

	static int findMin(int[] a) {
		int minnum = a[0], minplace = 0;
		for (int i = 1; i < a.length; i++)
			if (a[i] < minnum) {
				minnum = a[i];
				minplace = i;
			}
		return minplace;
	}

	static int[] mirrorTwoArray(int[] a) {
		int[] b = new int[a.length];
		int k = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			b[k] = a[i];
			k--;
		}
		return b;
	}

	static void mirrorOneArray(int[] a) {
		int k = a.length - 1, temp = 0;
		for (int i = 0; i < a.length / 2; i++) {
			temp = a[k];
			a[k] = a[i];
			a[i] = temp;
			k--;
		}
	}

	static void moverRight(int[] a) {
		int temp = a[a.length - 1];
		for (int i = a.length - 1; i > 0; i--)
			a[i] = a[i - 1];
		a[0] = temp;
	}

	static void moverLeft(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++)
			a[i - 1] = a[i];
		a[a.length - 1] = temp;
	}

	// --- end of 1 dimension array Functions ---
	// --- 2 dimension array Functions ---
	static void zero2d(int[][] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = 0;
	}

	static void input2d(int[][] a) {
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = s.nextInt();
	}

	static void output2d(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

	static int findMax2d(int[][] a) {
		int placei = 0, placej = 0, max = a[0][0];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (a[i][j] > max) {
					max = a[i][j];
					placei = i;
					placej = j;
				}
		return max;
	}

	static int findMin2d(int[][] a) {
		int placei = 0, placej = 0, min = a[0][0];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a[i].length; j++)
				if (a[i][j] < min) {
					min = a[i][j];
					placei = i;
					placej = j;
				}
		return min;
	}

	static int sumRow(int[][] a, int i) {
		int sum = 0;
		for (int j = 0; j < a[i].length; j++)
			sum += a[i][j];
		return sum;
	}

	static int sumCol(int[][] a, int j) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i][j];
		return sum;
	}

	static int sumFrame(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[0][i] + a[a.length - 1][i] + a[i][0] + a[i][a.length - 1];
		sum -= a[0][0] + a[0][a.length - 1] + a[a.length - 1][0] + a[a.length - 1][a.length - 1];
		return sum;
	}

	static void printMainDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i][i] + " ");
		System.out.println();
	}

	static int sumMainDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i][i];
		return sum;
	}

	static int sumAboveMainDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++)
				sum += a[i][j];
		return sum;
	}

	static int sumUnderMainDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 1; i < a.length; i++)
			for (int j = 0; j < i; j++)
				sum += a[i][j];
		return sum;
	}

	static void swappingUpDownMainDiagonal(int[][] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = i + 1; j < a.length; j++) {
				temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
	}

	static void printSecondaryDiagonal(int[][] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i][a.length - 1 - i] + " ");
		System.out.println();
	}

	static int sumSecondaryDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i][a.length - 1 - i];
		return sum;
	}

	static int sumAboveSecondaryDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = 0; j < a.length - 1 - i; j++)
				sum += a[i][j];
		return sum;
	}

	static int sumUnderSecondaryDiagonal(int[][] a) {
		int sum = 0;
		for (int i = 1; i < a.length; i++)
			for (int j = a.length - i; j < a.length; j++)
				sum += a[i][j];
		return sum;
	}

	static void swappingUpDownSecondaryDiagonal(int[][] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++)
			for (int j = 0; j < a.length - 1 - i; j++) {
				temp = a[i][j];
				a[i][j] = a[a.length - 1 - j][a.length - 1 - i];
				a[a.length - 1 - j][a.length - 1 - i] = temp;
			}
	}

	// --- end of 2 dimension array Functions ---
	// --- sorting of arrays ---
	static void selectionSortUp(int[] a) {
		int temp = 0, placeMin = 0;
		for (int i = 0; i < a.length - 1; i++) {
			placeMin = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] < a[placeMin])
					placeMin = j;
			temp = a[i];
			a[i] = a[placeMin];
			a[placeMin] = temp;
		}
	}

	static void selectionSortDown(int[] a) {
		int temp = 0, placeMax = 0;
		for (int i = 0; i < a.length - 1; i++) {
			placeMax = i;
			for (int j = i + 1; j < a.length; j++)
				if (a[j] > a[placeMax])
					placeMax = j;
			temp = a[i];
			a[i] = a[placeMax];
			a[placeMax] = temp;
		}
	}

	static void BubbleSortUp(int[] a) {
		int temp = 0;
		boolean sorted = false;
		for (int i = 0; i < a.length - 1 && !sorted; i++) {
			sorted = true;
			for (int j = 0; j < a.length - 1 - i; j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorted = false;
				}
		}
	}

	static void BubbleSortDown(int[] a) {
		int temp = 0;
		boolean sorted = false;
		for (int i = 0; i < a.length - 1 && !sorted; i++) {
			sorted = true;
			for (int j = 0; j < a.length - 1 - i; j++)
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					sorted = false;
				}
		}
	}

	// --- end of sorting ---
	static final int N = 4, M = 4;

	public static void main(String[] args) {
		int[] a1d = new int[N];
		int[] b1d;
		System.out.println("Does everything");
		System.out.println("Prepare for glory!!!");
		// - 1 dimension array usage -
		zero(a1d);
		input(a1d);
		output(a1d);
		int max1d = findMax(a1d);
		System.out.println(max1d + " " + a1d[max1d]);
		int min1d = findMin(a1d);
		System.out.println(min1d + " " + a1d[min1d]);
		mirrorOneArray(a1d);
		output(a1d);
		b1d = mirrorTwoArray(a1d);
		output(b1d);
		moverRight(b1d);
		output(b1d);
		moverLeft(a1d);
		output(a1d);
		// - end of 1 dimension array usage -
		// - 2 dimension array usage -
		int[][] a2d = new int[N][M];
		zero2d(a2d);
		output2d(a2d);
		input2d(a2d);
		output2d(a2d);
		int max2d = findMax2d(a2d); // maximal value is found
		System.out.println(max2d);
		for (int i = 0; i < a2d.length; i++)
			for (int j = 0; j < a2d[i].length; j++)
				if (a2d[i][j] == max2d)
					System.out.println(i + " " + j);
		// prints location of maximal number
		int min2d = findMin2d(a2d); // minimal value is found
		System.out.println(min2d);
		for (int i = 0; i < a2d.length; i++)
			for (int j = 0; j < a2d[i].length; j++)
				if (a2d[i][j] == min2d)
					System.out.println(i + " " + j);
		// prints location of minimal number
		for (int i = 0; i < a2d.length; i++)
			System.out.println("sum of row " + i + " is " + sumRow(a2d, i));
		// prints sums of all rows
		for (int j = 0; j < a2d[0].length; j++)
			System.out.println("sum of column " + j + " is " + sumCol(a2d, j));
		// prints sums of all columns
		System.out.println("sum of frame is " + sumFrame(a2d));
		// Main diagonal
		printMainDiagonal(a2d);
		System.out.println(sumMainDiagonal(a2d));
		System.out.println(sumAboveMainDiagonal(a2d));
		System.out.println(sumUnderMainDiagonal(a2d));
		// Secondary diagonal
		printSecondaryDiagonal(a2d);
		System.out.println(sumSecondaryDiagonal(a2d));
		System.out.println(sumAboveSecondaryDiagonal(a2d));
		System.out.println(sumUnderSecondaryDiagonal(a2d));
		swappingUpDownMainDiagonal(a2d);
		output2d(a2d);
		swappingUpDownMainDiagonal(a2d); // swaps again to restart array
		swappingUpDownSecondaryDiagonal(a2d);
		output2d(a2d);
		// - end of 2 dimension array usage -
		// Q: How do I use the "random" function?
		// A: int randomNum=(int)(Math.random()*(max-min+1))+min;
		// max - maximal random value, min - minimal random value
		// Q: Who are the creators?
		// A: Doron Laadan && Or Zabludowski (c) 2009 v2.1
		// Q: Any updates coming soon?
		// A: Just before every exam
		// Remember, it is only a test.
		// Good luck!
		// Doron && Or
	}
}
