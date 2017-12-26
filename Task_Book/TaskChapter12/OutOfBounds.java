import java.util.Random;

public class OutOfBounds {
	int[] randomArray = new int[100];
	
	public OutOfBounds() {
	}
	
	public void randomNumbers(int index) throws Exception {
		if (index > randomArray.length) {
			System.out.println("Out of Bounds!!");
			throw new Exception();
		}
		
		Random random = new Random();
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = Math.abs(random.nextInt(100));
	}
		System.out.print(randomArray[index]);
	}
}





