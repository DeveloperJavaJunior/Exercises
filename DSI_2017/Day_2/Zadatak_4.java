package day_2;

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
	
		System.out.print("Enter a number:");
		long n = in.nextLong();
		
		System.out.println(sumDigit(n));
	}
	public static long sumDigit(long n) {
		
		long sum = 0;
		
		while(n != 0){
			long ostatak = n % 10;
			sum += ostatak;
			n = n /10;
		}
		
		
		return sum;
		
	}

}
