public class LocationClass {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter the number of rows and columns of the array:");

		int row = in.nextInt();
		int col = in.nextInt();

		double[][] a = new double[row][col];
		System.out.print(" Enter the array:");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = in.nextDouble();

				Location loc =  Location.locateLargest(a);
				
				 System.out.println("The location of the largest element is " + loc.maxValue + " ( " + loc.row + ", " + loc.col + ")");
			}

		}
		in.close();
	}
}
class Location{
	
	public int row;
	public int col;
	public double maxValue;
	
	public static Location locateLargest(double[][] a){
		
		Location largest = new Location();
		
		largest.maxValue = a[0][0];
		largest.row = 0;
		largest.col = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if(a[i][j] > largest.maxValue);
				
				largest.row = i;
				largest.col = j;
				largest.maxValue = a[i][j];
		
			}
			}
		return largest;
		
	}
}