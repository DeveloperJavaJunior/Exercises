
public class Task24SumSeries {

	public static void main(String[] args) {
		double sum = 0;
		
		
		for(int i = 1; i <= 97; i += 2){
			sum += i / (i + 2.0);
		}
		   
		 System.out.println(" The sum is:" + sum);
		 }
		 

}
