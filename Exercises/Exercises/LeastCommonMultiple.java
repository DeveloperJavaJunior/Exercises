import java.util.Scanner;

/*
 * @author Edin Korkic
 * 
 * 
 */

public class LeastCommonMultiple {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Unesite prvi broj: ");
		
		int num1 = input.nextInt();
		
		System.out.print(" Unesite drugi broj: ");
		
		int num2 = input.nextInt();
		
		input.close();
		
		int max = (num1 > num2)?num1:num2;
		
		while(true){
			
			if(max % num1 == 0 && max % num2 == 0){
				
				System.out.printf(" Najmanji zajednicki sadrzalac: %d",max);
				
				break;
			}
			max++;
		}
		

	}

}
