package week03_2;

public class Zadatak03 {

	public static void main(String[] args) {
		for(int i = 1; i < 1000; i++){
			if(i % 4 == 0 && i % 5 != 0){
				System.out.print(i + " ");
			}
		}
	}

}
