
public class Task9ISBN {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter the first 9 digits of an ISBN as integer:");

		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int d3 = in.nextInt();
		int d4 = in.nextInt();
		int d5 = in.nextInt();
		int d6 = in.nextInt();
		int d7 = in.nextInt();
		int d8 = in.nextInt();
		int d9 = in.nextInt();
		in.close();

		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7
				+ d8 * 8 + d9 * 9) % 11;

		if (d10 == 10) {
			System.out.println(" The ISBN-10 nuber is " + d1 + " " + d2 + " "
					+ d3 + " " + d4 + " " + d5 + " " + d6 + " " + d7 + " " + d8
					+ " " + d9 + " X ");
		} else {
			System.out.println(" The ISBN-10 nuber is " + d1 + " " + d2 + " "
					+ d3 + " " + d4 + " " + d5 + " " + d6 + " " + d7 + " " + d8
					+ " " + d9 + " " + d10);

		}
	}

}
