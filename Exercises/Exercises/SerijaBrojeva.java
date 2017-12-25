

public class SerijaBrojeva 
{
	public static void main (String [] args) {
		
		double i = 1;
		double zbir = 0;
		
		for  ( i = 1; i< 98;i = i + 2 ){
			zbir += i /(i + 2);
		}
		System.out.println("Zbir brojeva je: " + zbir);
		
	}

}