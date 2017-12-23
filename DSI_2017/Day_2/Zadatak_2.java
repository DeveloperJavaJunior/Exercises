package day_2;

public class Zadatak_2 {

	public static void main(String[] args) {

		int ocjena = getGrade(65.5);

		System.out.printf("Vasa ocjena je:%d", ocjena);

	}

	public static int getGrade(double score) {

		if (score <= 60)
			return 6;
		else if (score <= 70)
			return 7;
        else if (score <= 90)
			return 9;
		else

			return 10;

	}

}
