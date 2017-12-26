import java.util.*;

public class Task9FindTheTwoHighestScore {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students:");
	
		int n = input.nextInt();
		int max = 0;
		int secondMax = 0;
		
		String maxName = "";
		String secondMaxName = "";
        
		for (int i = 0; i < n; i++) {
		System.out.print("Enter name and score of student (" + (i + 1)+ "):");
		
		String name = input.next();
		int score = input.nextInt();
		
		if (score > max) {
		secondMax = max;
		max = score;
		maxName = name;
		} else if (score > secondMax) {
		secondMax = score;
		secondMaxName = name;
		}
		
		
        }
		System.out.println("The student with the highest score is " + maxName);
		System.out.println("The highest score is " + max);
		System.out.println("The student with the second highest score is "+ secondMaxName);
		System.out.println("The second highest score is " + secondMax);
	}
}
		


