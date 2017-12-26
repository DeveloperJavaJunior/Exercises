package Task_Chapter_10;

import java.util.Scanner;

public class PrimeFactorsTest {

	public static void main(String[] args) {
	
		System.out.print(" Enter a number:");
		
		int n = new Scanner(System.in).nextInt();
		
		PrimeFactors factors = new PrimeFactors(20);
		int i = 2;
		while(i <= n)
			if(n % i== 0){
		      factors.push(i);
				n /= i;
			}else{
					i++;
			}
		
	
		
		
		while(!factors.empty())
		
		System.out.print(factors.pop() + " ");

	}

}


