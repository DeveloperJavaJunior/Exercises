
public class Task15ASCII {

	public static void main(String[] args) {
		
		for(char i = '!'; i < '_';i++){
			System.out.print(i + " ");
			if((i - 32) % 10 == 0){
				System.out.println(" ");
				
			}
		}

	}

}