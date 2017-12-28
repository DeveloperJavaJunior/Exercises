package week05;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month (ex. Jan, Feb...): ");
		String month = input.nextLine();
		System.out.println("Enter a year: ");
		int year = input.nextInt();

		switch (month) {
		case "Jan":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Feb":
			System.out.println(month + " " + year + " has "+ ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "29" : "28")+" days");
			break;
		case "Mar":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Apr":
			System.out.println(month + " " + year + " has 30 days");
			break;
		case "Maj":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Jun":
			System.out.println(month + " " + year + " has 30 days");
			break;
		case "Jul":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Avg":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Sep":
			System.out.println(month + " " + year + " has 30 days");
			break;
		case "Okt":
			System.out.println(month + " " + year + " has 31 days");
			break;
		case "Nov":
			System.out.println(month + " " + year + " has 30 days");
			break;
		case "Dec":
			System.out.println(month + " " + year + " has 31 days");
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	}

}
