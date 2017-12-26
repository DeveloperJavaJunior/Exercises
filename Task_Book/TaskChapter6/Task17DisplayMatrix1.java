
public class Task17DisplayMatrix1 {

	public static void main(String[] args) {
		
		int n = 3;
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
