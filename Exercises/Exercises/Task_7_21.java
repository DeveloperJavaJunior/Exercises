public class Task_7_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number of balls to drop: ");
		int balls = input.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		int numOfSlots = input.nextInt();
		int[] slots = new int[numOfSlots];

		// Kreiram array i popunjavam ga stringovim koji
		// prikazuju putanju kuglica
		String[] releasedBalls = dropBalls(balls, numOfSlots);

		// Popunjavanje array slots
		for (int i = 0; i < releasedBalls.length; i++)
			slots[countRs(releasedBalls[i])]++;

		// Ispis putanje svih kuglica
		for (int i = 0; i < releasedBalls.length; i++)
			System.out.println(releasedBalls[i]);

		// Graficki prikaz polozaja kuglica u slotovima
		for (int i = balls; i > 0; i--) {
			for (int j = 0; j < slots.length; j++) {
				if (slots[j] == i) {
					System.out.print("0");
					slots[j]--;
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		input.close();
	}

	/**
	 * Nasumicno generisati 0 ili 1 i dodijeliti im char vrijednost L ili R
	 */
	public static char generateLeftOrRight() {
		if ((int) (Math.random() * 2) == 0)
			return 'L';
		else
			return 'R';
	}

	/**
	 * Generisati cijeli put kuglice od pina do pina i vratiti string, zavisno
	 * od broja slotova dobijemo npr LRLLRLR
	 */
	public static String generatePath(int numberOfSlots) {
		String path = "";
		for (int i = 1; i < numberOfSlots; i++) {
			path += (char) generateLeftOrRight();
		}
		return path;
	}

	/**
	 * Nakon bacanja svih kuglica, n, vratiti string array npr RLLRRLR,
	 * LLLRRRLR, RLRLRLR,... itd
	 */
	public static String[] dropBalls(int n, int numberOfSlots) {
		String[] allBalls = new String[n];
		for (int i = 0; i < n; i++) {
			allBalls[i] = generatePath(numberOfSlots);
		}
		return allBalls;
	}

	/** izbojati broj karaktera 'R' u stringu s */
	public static int countRs(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R')
				count++;
		}
		return count;
	}
}
