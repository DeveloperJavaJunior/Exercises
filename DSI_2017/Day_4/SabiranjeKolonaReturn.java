package day_4;

public class SabiranjeKolonaReturn {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		System.out.print(" Unesite broj redova:");
		int r = in.nextInt();
		
		System.out.print(" Unesite broj kolona:");
		int c = in.nextInt();
		
		int[][] m = new int[r][c];
		System.out.format(" Unesite 2D niz sa %d reda i %d kolone:", r, c);
		
		for(int row = 0; row < m.length; row++){
			for(int col = 0; col < m[0].length; col++){
				m[row][col] = in.nextInt();
			}
		}
		for(int col = 0; col < m[0].length; col++){
			
		in.close();
		System.out.format(" Suma elemenata %d kolone iznosi %d.\n" , col, sumColumn(m,col));
		}
	}
	public static int sumColumn(int[][] m,int columnIndex) {
		int sum = 0;
		
		for(int row = 0; row < m.length; row++){
			sum += m[row][columnIndex];
		}
	return sum;
	}

}
