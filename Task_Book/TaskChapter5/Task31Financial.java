import java.util.*;

public class Task31Financial {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		  
		  System.out.print("Enter the initial deposit amount:");
		  double saving = input.nextDouble();
		 
		  System.out.print("Enter annual percentage yield:");
		  double interest = input.nextDouble();
		  interest /= 12 * 100; 
		 
		  System.out.print("Enter maturity period (number of months):");
		  double numberMonths = input.nextDouble();
		 
		 
		  System.out.printf("%7s%12s\n", "Month", "CD value");
		 
		  for (int i = 1; i <= numberMonths; i++) {
		 
		   saving = saving * (1 + interest);
		   System.out.printf("%4d%12.2f\n", i, saving);
		 
		  }

	}

}
