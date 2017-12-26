import java.util.*;

public class Task9Acceleration {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter velocity,velocity1 and time:");
		
		double velocity = input.nextDouble();
		double velocity1 = input.nextDouble();
		
		double time = input.nextDouble();
		input.close();
		
		double acceleration1 = velocity1 - velocity;
		double acceleration = acceleration1 / (time);
		
		System.out.println(" The average acceleration is:" + acceleration);
		

	}

}
