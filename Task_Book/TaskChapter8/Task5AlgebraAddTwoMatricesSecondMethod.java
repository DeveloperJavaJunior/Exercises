
public class Task5AlgebraAddTwoMatricesSecondMethod {
	
	public static double[][] addMatrix(double[][] a, double[][] b){
		double[][] c = new double[a.length][a[0].length];
		
		for(int i=0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				c[i][j] += a[i][j] + b[i][j];
			}
		}
		return c;
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);

		double[][] a=new double[3][3];
		double[][] b=new double[3][3];
		
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.printf("a[%d][%d]=", i, j);
				a[i][j] = input.nextDouble();
			}
		}
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++){
				System.out.printf("b[%d][%d]=", i, j);
				b[i][j] = input.nextDouble();
			}
			
		}
		double[][] c = addMatrix(a,b);
		
		 for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					System.out.printf("%7.2f",c[i][j] );
				}
				System.out.println();
			}
	}
}