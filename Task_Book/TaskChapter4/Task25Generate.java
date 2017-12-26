public class Task25Generate {

	public static void main(String[] args) {

		char letter1 = (char)((int)(Math.random() *26 + 65));
		char letter2 = (char)((int)(Math.random() *26 + 65));
		char letter3 = (char)((int)(Math.random() *26 + 65));
		
		int numbers = (int)(Math.random() * 10000);
		String s = String.format("%4d",numbers);
	
		System.out.println(" The plate namber is " + letter1 + letter2 + letter3 + numbers);
	}

}
