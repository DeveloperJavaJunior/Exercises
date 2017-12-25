import java.util.Scanner;

public class Z1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.print(" unesite string: ");
	
	String s = input.nextLine();
	
	String str = "";
	
	String reverse = "";
	
	for(int i = s.length() - 1; i >= 0; i--){
		reverse += s.charAt(i);
		
		if(reverse.equalsIgnoreCase(s)){
			
			System.out.println(reverse);
		}
	}

	}

}
