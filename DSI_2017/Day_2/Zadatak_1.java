package day_2;

public class Zadatak_1 {

	public static void main(String[] args) {
		
printGrade(65.5);

	}
	public static void printGrade(double score) {
		
		if(score <= 60)
			System.out.println("Pali ste ispit.");
		else if(score<=70)
			System.out.println("Vasa ocjena je 7.");
		else if(score<=80)
			System.out.println("Vasa ocjena je 8.");
		else if(score<=90)
			System.out.println("Vasa ocjena je 9.");
		else
			System.out.println("Vasa ocjena je 10.");
		
	}

}
