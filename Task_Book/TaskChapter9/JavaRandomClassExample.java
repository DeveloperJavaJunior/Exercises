
import java.util.Random;
/**
 * Create a random number that is greater than or equal to 0,
 * and less than 100. (It is set to run 20 tests.)
 */

public class JavaRandomClassExample {

	public static void main(String[] args) {
		
		    // run 20 random examples
		    int numTests = 20;
		 
		    // create a new Java Random object
		    Random random = new Random();
		    for ( int i=0; i<numTests; i++ )
		    {
		      // get the next random int
		      int randomInt = random.nextInt(100);
		      System.out.format("test %2d, randomInt = %d\n", i+1, randomInt );
		    }
		  }
}