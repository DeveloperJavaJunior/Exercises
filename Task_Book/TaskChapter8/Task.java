public class Task {

	public static void main(String[] args) {
		 int[][] hours = {
		          {2, 4, 3, 4, 5, 8, 8},
		          {7, 3, 4, 3, 3, 4, 4},
		          {3, 3, 4, 3, 3, 2, 2},
		          {9, 3, 4, 7, 3, 4, 1},
		          {3, 5, 4, 3, 6, 3, 8},
		          {3, 4, 4, 6, 3, 4, 4},
		          {3, 7, 4, 8, 3, 8, 4},
		          {6, 3, 5, 9, 2, 7, 9}};
		
		int[] total = new int[hours.length];
		for (int i = 0; i < hours.length; i++) {
			for (int j = 0; j < hours.length; j++) {

				total[i] += hours[i][j];

			}

		}

		int[] index = new int[hours.length];

		sortIndex(total, index);

		for (int i = 0; i < hours.length; i++)

			System.out.println("Employee " + index[i] + " hours are: " +

			total[i]);

	}

	static void sortIndex(int[] list, int[] indexList) {

		int currentMax;

		int currentMaxIndex;

		for (int i = 0; i < indexList.length; i++)

			indexList[i] = i;

		for (int i = list.length - 1; i >= 1; i--) {

			currentMax = list[i];

			currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {

				if (currentMax < list[j]) {

					currentMax = list[j];

					currentMaxIndex = j;

				}

			}

			// How do I make it go in descending order????

			if (currentMaxIndex != i) {

				list[currentMaxIndex] = list[i];

				list[i] = currentMax;

				int temp = indexList[i];

				indexList[i] = indexList[currentMaxIndex];

				indexList[currentMaxIndex] = temp;
				// TODO Auto-generated method stub

			}

		}
	}
}
