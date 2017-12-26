
public class Task13Find {

	public static void main(String[] args) {
		
		int n = 1;
		while (Math.pow(n,3) <= 12000) {
			n++;
		}
		System.out.println(" The n is " + n);
		System.out.println(" The n^3 is " + Math.pow(n,3));
	}

}
