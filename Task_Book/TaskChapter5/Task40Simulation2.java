public class Task40Simulation2 {

	public static void main(String[] args) {

		int head = 0;
		int tail = 0;

		for (int i = 1; i < 1000000; i++) {
			int coin = (int) (Math.random() * 2);

			if (coin == 0) {
				tail++;
			} else {
				head++;
			}
		}
		System.out.println("The coin thrown a million times fell " + head + " several times on the head of a " + tail + " to the tail.");

	}

}
