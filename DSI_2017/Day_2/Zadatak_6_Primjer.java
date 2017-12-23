package day_2;

public class Zadatak_6_Primjer {

	public static void main(String[] args) {
	
		printChars('A', 'Z', 13);
	}
	public static void printChars(char ch1, char ch2, int numPerLine) {
		
		int count = 1;
		
		if(ch1 > ch2){
			char temp = ch1;
			ch1 = ch2;
			ch2 = temp;
		}
		for(int i = ch1; i <= ch2; i++ ,count ++){
			if(count % numPerLine == 0){
				System.out.println((char)i);
			}else{
				System.out.println((char)i);
				
			}
		}
	}
	

}
