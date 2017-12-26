
public class Task7NumbersOfYears {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter number of minutes:");
		
		int minutes = in.nextInt();
		in.close();
		
		int years = minutes / 525600;
		int days = (minutes % 525600) / 1440;
		
		System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days.");
	}

}
