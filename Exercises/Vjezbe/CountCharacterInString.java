import java.util.Scanner;

public class CountCharacterInString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite string: ");
		
		String s = input.nextLine();
		
		System.out.print(" Unesite karakter: ");
		
		char ch = input.next().charAt(0);
		
		input.close();
		
		int i = 0;
		
		
		System.out.println(countLetters(s,ch,i));

	}
public static int countOccurences(String s,char ch) {
	
	int count = 0;
	
	for(int i = 0; i < s.length(); i++){
		if(s.charAt(i) == ch){
			count++;
		}
	}
	return count;
	
}
public static int countLetters(String s,char ch,int index) {
	
	if(index >= s.length()){
			return 0;
		}
	int count = s.charAt(index) == ch?1:0;
	
	return count + countLetters(s,ch,index + 1);
	
	}
}


/**
 if (index >= someString.length()) {
        return 0;
    }
     
    int count = someString.charAt(index) == searchedChar ? 1 : 0;
    return count + countOccurences(
      someString, searchedChar, index + 1);
}
 */
