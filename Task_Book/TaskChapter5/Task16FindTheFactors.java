import java.util.*;

public class Task16FindTheFactors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter an intergers:");
		
		int n = input.nextInt();
		input.close();
		int m = 2;
		
		while(n != 1){
			if(n % m == 0){
				n = (n / m);
				System.out.print(m + ", ");
			}else{
				m++;
			}
			
		}

	}

}
