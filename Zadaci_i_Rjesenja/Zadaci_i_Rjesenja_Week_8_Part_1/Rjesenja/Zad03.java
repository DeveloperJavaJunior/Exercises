package part2;

public class Zad03 {
	public static void shuffle(int[][] m){
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int randomRow = (int)(Math.random() * m.length);
				int randomColumn = (int)(Math.random() * m[i].length);
				int temp = m[i][j];
				m[i][j] = m[randomRow][randomColumn];
				m[randomRow][randomColumn] = temp;
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
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[][] m = {{1,2},{3,4},{5,6},{7,8},{9,10}};
		System.out.println("Original matrix: ");
		printArray(m);
		shuffle(m);
		System.out.println("Shuffled matrix: ");
		printArray(m);
	}

}
