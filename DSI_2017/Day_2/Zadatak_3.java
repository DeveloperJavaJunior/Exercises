package day_2;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		System.out.format("Max number is %d %n",max(3,5));
		System.out.format("Max number is %.2f", max(3.0,5.0));

	}

	public static int max(int a, int b) {
		
		if(a > b)
			return a;
		else
		return b;
		
	}
		public static double max(double a, double b) {
			
			if(a > b)
				return a;
			else
				return b;
		}
			
}
