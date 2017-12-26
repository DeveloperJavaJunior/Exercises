
public class Task16RandomCharacter {

	public static void main(String[] args) {
		
		int i = (int)(Math.random() * 26 + 65);
		char ch = (char)i;
		
		System.out.println(" The random letter is " + ch);
	}

}
