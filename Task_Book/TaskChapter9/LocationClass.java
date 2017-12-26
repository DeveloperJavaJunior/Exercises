

import java.util.Scanner;

public class LocationClass {
	 

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 
		   System.out.print("Enter the number of rows and columns in the array: ");
		
		   int numberOfRows = input.nextInt();
		
		   int numberOfColumns = input.nextInt();
		 
		   System.out.println("Enter the array");
		
		   double[][] a = new double[numberOfRows][numberOfColumns];
		 
		   for (int i = 0; i < a.length; i++) {
	
		   for (int j = 0; j < a[i].length; j++) {
		
		   a[i][j] = input.nextDouble();
		   input.close();
		  
		   Location loc = Location.locateLargest(a);
	
		 System.out.println("The location of the largest element is " + loc.maxValue + " at " + loc.row + ", " + loc.column + ")");
		    }
	
		   }
	
		  }
		
		 }
		
		 class Location {
		
		  public int row;
	
		  public int column;
		
		  public double maxValue;
		
		   
	
		  public static Location locateLargest(double[][] a) {
	
		  Location largest = new Location();
	
		  largest.maxValue = a[0][0];
		
		  largest.row = 0;
		
		  largest.column = 0;
		
		  for (int i = 0; i < a.length; i++) {
	
		  for (int j = 0; j < a.length; j++) {
		
		  if (a[i][j] > largest.maxValue) {
	
		  largest.row = i;
		
		  largest.column = j;
	
		  largest.maxValue = a[i][j];
		
		   }
		
		  }
		
		 }
		return largest;

		 
		   }
	
		   }

		   