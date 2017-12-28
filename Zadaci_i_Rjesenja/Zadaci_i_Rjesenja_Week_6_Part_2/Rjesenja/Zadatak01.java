package week06;

public class Zadatak01 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++){
			count++;
			System.out.print(getPentagonalNumber(i) + " ");
			if(count % 10 == 0){
				System.out.println();
			}
			
		}
	}
	
	public static int getPentagonalNumber(int n){
		return n * (3 * n - 1)/2;
	}

}
