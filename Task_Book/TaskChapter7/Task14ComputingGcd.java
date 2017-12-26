
public class Task14ComputingGcd {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print(" Enter five numbers:");

		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		System.out.println(" The gcd is:" + gcd(numbers));

	}

	public static int gcd(int ... numbers) {
		int gcd = min(numbers);
				
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % gcd == 0){
			}else{
				numbers[i] = numbers[i] % gcd;
			}
		}
		if(gcd == min(numbers)){
			return gcd;
		}	
		return gcd(numbers);	
	}
	public static int min(int ... numbers) {
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++){
			if(min > numbers[i]){
				min = numbers[i];
			}
		}
	return min;
	}
}
