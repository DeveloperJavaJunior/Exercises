import java.util.*;

public class Task1AssignGrades {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter the number of students:");
		
		int n = input.nextInt();
		int[]score = new int[n];
		int bestScore = 0;
		
		System.out.print(" Enter " + n + " scores:");
		
		for(int i = 0; i < score.length; i++){
			score[i] = input.nextInt();
			
			if(bestScore < score[i]){
				bestScore = score[i];
				}
		}
		char grade;
		
		for(int i = 0; i < score.length; i++){
			if(score[i] >= bestScore - 10){
				grade = 'A';
			}
			else if(score[i] >= bestScore - 20){
				grade = 'B';
			}
			else if(score[i] >= bestScore - 30){
				grade = 'C';
			}
			else if(score[i] >= bestScore - 40){
				grade = 'D';
			}
			else{
				grade = 'F';
			}
			
			System.out.println(" Student " + n + " score is " + score[i] + " and grade is " + grade);
		}

		input.close();
	}

}
