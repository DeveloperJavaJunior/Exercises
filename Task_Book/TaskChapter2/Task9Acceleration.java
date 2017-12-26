
public class Task9Acceleration {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print(" Enter velocity,velocity1 and time:");

		double velocity = in.nextDouble();
		double velocity1 = in.nextDouble();

		double time = in.nextDouble();
		in.close();

		double acceleration1 = velocity1 - velocity;
		double acceleration = acceleration1 / (time);

		System.out.println(" The average acceleration is:" + acceleration);

	}

}
