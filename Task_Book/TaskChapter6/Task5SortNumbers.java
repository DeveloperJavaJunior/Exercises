import java.util.*;

public class Task5SortNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter three numbers:");

		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		input.close();

		displaySortedNumbers(num1, num2, num3);
	}

	public static void displaySortedNumbers(double num1,double num2,double num3) {
		
		if(num1 > num2){
			double temp = num1;
			num1 = num2;
			num2 = temp; 
		}
		if(num2 > num3){
			double temp = num2;
			num2 = num3;
			num3 = temp; 
		}
			if(num1 > num2){
				double temp = num1;
				num1 = num2;
				num2 = temp; 
			}	
				System.out.println(" The sorted nuber is " +  num1 + " " + num2 + " " + num3);
			}
}