import java.util.*;

public class Task17DisplayMatrix2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter n:");
		
		int n = input.nextInt();
		input.close();
		printMatrix(n);
	}
	public static void printMatrix(int n){
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(intRandom(0, 1) + " ");
			}
			System.out.println();
		}
	}
	private static int intRandom(int lowerBound, int upperBound) {
		return (int) ((lowerBound + Math.random()) * (upperBound - lowerBound + 1));

	}

}
