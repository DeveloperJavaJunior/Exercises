

public class Task2ThreeNumbers {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Input a three numbers:");
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		if( a + b == c){
			System.out.print(" The input is correct.");
			
		}
		else{
			System.out.print(" The input is incorrect.");
			
		}
	}

}
