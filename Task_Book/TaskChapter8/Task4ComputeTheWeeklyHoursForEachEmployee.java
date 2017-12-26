public class Task4ComputeTheWeeklyHoursForEachEmployee {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter number employee:");

		int n = input.nextInt();
		int[][] employee = new int[n][7];

		for (int row = 0; row < n; row++) {
			System.out.printf(" Enter hours for %d worker\n", row + 1);
			for (int col = 0; col < employee[0].length; col++)
				employee[row][col] = input.nextInt();
		}
		sort(employee);
		System.out.println("Sorting worker to total nubers hours:");
		for (int row = 0; row < employee.length; row++) {
			System.out.printf("%d.worker: ", row + 1);
			for (int col = 0; col < employee[0].length; col++) {
				System.out.printf("%3d", employee[row][col]);
			}
			System.out.println();
		}
	}

	public static int[][] sort(int[][] employee) {
		int[] hours = new int[employee.length];

		for (int row = 0; row < employee.length; row++) {
			hours[row] = 0;

			for (int i = 0; row < employee.length; row++) {
				for (int j = 0; j < employee[0].length; j++) {
					hours[i] += employee[i][j];
				}
			}

			for (int i = 0; i < employee.length - 1; i++) {
				for (int m = i + 1; m < employee.length; m++) {
					if (hours[i] < hours[m]) {
						for (int j = 0; j < employee[0].length; j++) {

							int replace = employee[m][j];
							employee[m][j] = employee[i][j];
							employee[i][j] = replace;
						}
						int replace = hours[i];
						hours[i] = hours[m];
						hours[i] = replace;
					}
				}
			}
		}
		return employee;
	}
}
