public class Task40Simulation1 {

	public static void main(String[] args) {

		int c = 0;
		int h = 0;
		int t = 0;

		for (int i = 1; i < 1e6; i++) {
			c = (int) (Math.random() * 2);

			if (c == 1) {
				h++;
			} else {
				t++;
			}
		}
		System.out.println(" The number of heads is " + h);
		System.out.println(" The number of tails is " + t);

	}

}
