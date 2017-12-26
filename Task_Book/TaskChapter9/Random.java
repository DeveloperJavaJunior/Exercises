
import java.util.*;

public class Random {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomRange = 100; // You can change the limit if required
		int displayCount = 5; // You can decide the iteration count
		
		RandomNumber.genRandom(randomRange, displayCount);
		System.out.println("Random Number [Iteration " + (i + 1) +"]: " + genRandom(randomRange));

	}
	
}

	

		    public static int genRandom(int randomRange) {
		        return new Random().nextInt(randomRange);
		    }

		    public static void genRandom(int randomRange, int displayCount) {
		        for (int i = 0; i < displayCount; i++) {
		        }

		    }
}
